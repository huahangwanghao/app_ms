package cn.com.lzt.service.cms.impl;/**
 * Created by Administrator on 2017/8/3.
 */

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.mapper.TCmsShoppingCarMapper;
import cn.com.lzt.model.TCmsShoppingCar;
import cn.com.lzt.service.cms.CustomerBuyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public ResponseMessage addBuyCar(TCmsShoppingCar customerBuyReq) {
        tCmsShoppingCarMapper.insertSelective(customerBuyReq);
        return ResponseMessage.createSuccessMsg(0);
    }

    /**
     * 修改购物车
     *
     * @param customerBuyReq@return
     */
    @Override
    public ResponseMessage updateBuyCar(TCmsShoppingCar customerBuyReq) {
        tCmsShoppingCarMapper.updateByPrimaryKeySelective(customerBuyReq);
        return ResponseMessage.createSuccessMsg(0);
    }
}
