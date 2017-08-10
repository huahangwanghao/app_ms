package com.haohai.cms.service.cms.impl;/**
 * Created by Administrator on 2017/8/3.
 */

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.common.util.JsonUtil;
import com.haohai.cms.mapper.TCmsCustomerGoodMapper;
import com.haohai.cms.mapper.TCmsCustomerOrderMapper;
import com.haohai.cms.mapper.TCmsGoodMapper;
import com.haohai.cms.mapper.TCmsShoppingCarMapper;
import com.haohai.cms.model.TCmsCustomerGood;
import com.haohai.cms.model.TCmsCustomerGoodCriteria;
import com.haohai.cms.model.TCmsCustomerOrder;
import com.haohai.cms.model.TCmsGood;
import com.haohai.cms.model.TCmsShoppingCar;
import com.haohai.cms.model.TCmsShoppingCarCriteria;
import com.haohai.cms.model.dto.CustomerBuyReq;
import com.haohai.cms.model.dto.PageDto;
import com.haohai.cms.service.cms.CustomerBuyService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 客户service
 *
 * @author WangH
 * @create 2017-08-03 15:00
 **/
@Service
@Transactional
public class CustomerBuyServiceImpl implements CustomerBuyService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerBuyServiceImpl.class);
    
    @Autowired
    private TCmsShoppingCarMapper tCmsShoppingCarMapper;
    @Autowired
    private TCmsCustomerGoodMapper tCmsCustomerGoodMapper;
    @Autowired
    private TCmsCustomerOrderMapper tCmsCustomerOrderMapper;
    @Autowired
    private TCmsGoodMapper tCmsGoodMapper;


    /**
     * 增加购物车
     *
     * @param customerBuyReq
     * @return
     */
    @Override
    public ResponseMessage addShoppingCar(TCmsShoppingCar customerBuyReq) {

        /***
         * 
         * 对于添加购物车的伪代码
         * 
         * 1.用户在前台浏览商品, 点击添加购物车
         * 
         * 
         * 
         * 
         */












        //1.添加之前判断该商品是否还有库存
        int goodId=customerBuyReq.getCmsGoodId();
        TCmsGood good=tCmsGoodMapper.selectByPrimaryKey(goodId);
        String status=good.getGoodStatus();
        if("0".equals(status)){
            return ResponseMessage.customMsg("此商品已经下架!");
        }else{
            int hasCount=good.getHasCount();
            if(hasCount<1){
                return ResponseMessage.customMsg("商品库存不足!");
            }  
        }
        
        tCmsShoppingCarMapper.insertSelective(customerBuyReq);
        return ResponseMessage.createSuccessMsg(0);
    }

    /**
     * 修改购物车
     *
     * @param customerBuyReq@return
     */
    @Override
    public ResponseMessage updateShoppingCar(TCmsShoppingCar customerBuyReq) {
        tCmsShoppingCarMapper.updateByPrimaryKeySelective(customerBuyReq);
        return ResponseMessage.createSuccessMsg(0);
    }

    /**
     * 得到购物车的列表
     *
     * @param customerBuyReq
     * @return
     */
    @Override
    public ResponseMessage getShoppingCarList(CustomerBuyReq customerBuyReq) {

        TCmsShoppingCarCriteria tCmsShoppingCarCriteria=new TCmsShoppingCarCriteria();
        TCmsShoppingCarCriteria.Criteria criteria=tCmsShoppingCarCriteria.createCriteria();
        //这个客户Id
        criteria.andCustomerIdEqualTo(customerBuyReq.getCustomerId());
        //表示有效状态
        criteria.andShoppingCarStatusEqualTo("1");
        PageHelper.startPage(customerBuyReq.getPageNumber(),customerBuyReq.getPageSize());
        List<TCmsShoppingCar> list=tCmsShoppingCarMapper.selectByExample(tCmsShoppingCarCriteria);
        PageInfo<TCmsShoppingCar> pageInfo1=new PageInfo<>();
        return ResponseMessage.createSuccessMsg(list);
    }

    /**
     * 得到购物车的详情
     *
     * @param carId
     * @return
     */
    @Override
    public ResponseMessage getShoppingCarDetailById(int carId) {
        TCmsShoppingCar t=tCmsShoppingCarMapper.selectByPrimaryKey(carId);
        return ResponseMessage.createSuccessMsg(t);
    }

    /**
     * 得到订单列表
     *SELECT o.*,g.cms_good_id from t_cms_customer_order o , t_cms_customer_good g where o.order_id=g.order_id and o.data_flag=1 and o.customer_id=
     * @param customerBuyReq
     * @return
     */
    @Override
    public ResponseMessage getOrderList(CustomerBuyReq customerBuyReq) {
        Map<String,Object> param=new HashMap<>();
        param.put("customerId",customerBuyReq.getCustomerId()+"");
        PageHelper.startPage(customerBuyReq.getPageNumber(),customerBuyReq.getPageSize());
        List<TCmsCustomerOrder> list=tCmsCustomerOrderMapper.selectOrderList(param);
        PageInfo<TCmsCustomerOrder> pageInfo=new PageInfo<>(list);
        JSONObject json=JsonUtil.getPageInfo2JsonObject(pageInfo.getTotal(),list);
        return ResponseMessage.createSuccessMsg(json);
    }

    /**
     * 得到订单详情,通过订单Id,查询所有的商品
     * @param customerBuyReq
     * @return
     */
    @Override
    public ResponseMessage getOrderDetail(CustomerBuyReq customerBuyReq) {
        
        int orderId=customerBuyReq.getOrderId();
        TCmsCustomerGoodCriteria tCmsCustomerGoodCriteria=new TCmsCustomerGoodCriteria();
        TCmsCustomerGoodCriteria.Criteria criteria=tCmsCustomerGoodCriteria.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<TCmsCustomerGood> list=tCmsCustomerGoodMapper.selectByExample(tCmsCustomerGoodCriteria);
        return ResponseMessage.createSuccessMsg(list);
       
    }

    /**
     * 修改订单
     *
     * @param customerBuyReq
     * @return
     */
    @Override
    public ResponseMessage updateOrder(CustomerBuyReq customerBuyReq) {
        return null;
    }

    /**
     * 通过后台查询订单
     *
     * @param pageDto
     * @return
     */
    @Override
    public ResponseMessage getOrderList4Cms(PageDto pageDto) {
        
        Map<String,Object> param=new HashMap<>();


        JSONObject paramJson = JSONObject.parseObject(pageDto.getParamJson());
        String customerName=paramJson.getString("customerName");
        if (StringUtils.isNotEmpty(customerName))
            param.put("customerName","%" + customerName.trim() + "%");
        
        String goodStartDate=paramJson.getString("startDate");
        if (StringUtils.isNotEmpty(goodStartDate))
            param.put("startDate",goodStartDate);
        
        String goodEndDate=paramJson.getString("endDate");
        if (StringUtils.isNotEmpty(goodEndDate))
            //param.put("endDate","DATE_FORMAT(crt_date,'%Y-%m-%d') >='" + goodEndDate + "'");
            param.put("endDate",goodEndDate );
        
        String goodStatus=paramJson.getString("goodStatus");
        if (StringUtils.isNotEmpty(goodStatus))
            param.put("goodStatus",goodStatus);
        
        String orderId=paramJson.getString("orderId");
        if (StringUtils.isNotEmpty(orderId))
            param.put("orderId","%" + orderId.trim() + "%");
        PageHelper.startPage(pageDto.getPageNumber(),pageDto.getPageSize());
        List<TCmsCustomerOrder> list=tCmsCustomerOrderMapper.selectOrderList4Cms(param);
        PageInfo<TCmsCustomerOrder> pageInfo=new PageInfo<>(list);
        JSONObject json=JsonUtil.getPageInfo2JsonObject(pageInfo.getTotal(),list);
        return ResponseMessage.createSuccessMsg(json);
    }

    /**
     * 通过主键Id更新对应的数据
     *
     * @param tCmsCustomerGood
     * @return
     */
    @Override
    public ResponseMessage updateCustomerGoodById(TCmsCustomerGood tCmsCustomerGood) {
        tCmsCustomerGoodMapper.updateByPrimaryKeySelective(tCmsCustomerGood);
        return ResponseMessage.createSuccessMsg(0);
    }
}
