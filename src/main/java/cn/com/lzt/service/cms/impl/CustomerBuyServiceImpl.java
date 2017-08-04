package cn.com.lzt.service.cms.impl;/**
 * Created by Administrator on 2017/8/3.
 */

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.mapper.TCmsShoppingCarMapper;
import cn.com.lzt.model.TCmsShoppingCar;
import cn.com.lzt.model.TCmsShoppingCarCriteria;
import cn.com.lzt.model.dto.CustomerBuyReq;
import cn.com.lzt.service.cms.CustomerBuyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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


    /**
     * 增加购物车
     *
     * @param customerBuyReq
     * @return
     */
    @Override
    public ResponseMessage addShoppingCar(TCmsShoppingCar customerBuyReq) {
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
     * 得到订单
     *
     * @param customerBuyReq
     * @return
     */
    @Override
    public ResponseMessage getOrderList(CustomerBuyReq customerBuyReq) {
        return null;
    }

    /**
     * 得到订单详情
     *
     * @param customerBuyReq
     * @return
     */
    @Override
    public ResponseMessage getOrderDetail(CustomerBuyReq customerBuyReq) {
        return null;
    }
}
