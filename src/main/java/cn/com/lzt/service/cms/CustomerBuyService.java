package cn.com.lzt.service.cms;

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.model.TCmsShoppingCar;
import cn.com.lzt.model.dto.CustomerBuyReq;

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



}
