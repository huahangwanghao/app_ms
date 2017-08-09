package com.haohai.cms.service.cms;

import com.alibaba.fastjson.JSONObject;
import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.model.TCmsShoppingCar;
import com.haohai.cms.model.dto.CustomerBuyReq;
import com.haohai.cms.model.dto.PageDto;

/**
 * Created by Administrator on 2017/7/20.
 */
public interface CustomerBuyService {
    /**
     * 增加购物车
     * @return
     */
    ResponseMessage addShoppingCar(TCmsShoppingCar customerBuyReq);

    /**
     * 修改购物车
     * @param 
     * @return
     */
    ResponseMessage updateShoppingCar(TCmsShoppingCar customerBuyReq);

    /**
     * 得到购物车的列表
     * @param customerBuyReq
     * @return
     */
    ResponseMessage getShoppingCarList(CustomerBuyReq customerBuyReq);

    /**
     * 得到购物车的详情
     * @param carId
     * @return
     */
    ResponseMessage getShoppingCarDetailById(int carId);

    /**
     * 得到订单
     * @param customerBuyReq
     * @return
     */
    ResponseMessage getOrderList(CustomerBuyReq customerBuyReq);

    /**
     * 得到订单详情
     * @param customerBuyReq
     * @return
     */
    ResponseMessage getOrderDetail(CustomerBuyReq customerBuyReq);
    /**
     * 修改订单
     * @param customerBuyReq
     * @return
     */
    ResponseMessage updateOrder(CustomerBuyReq customerBuyReq);

    /**
     * 通过后台查询订单
     * @param pageDto
     * @return
     */
    JSONObject getOrderList4Cms(PageDto pageDto);
}
