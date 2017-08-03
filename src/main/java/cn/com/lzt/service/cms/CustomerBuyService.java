package cn.com.lzt.service.cms;

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.model.TCmsShoppingCar;

/**
 * Created by Administrator on 2017/7/20.
 */
public interface CustomerBuyService {
    /**
     * 增加购物车
     * @return
     */
    ResponseMessage addBuyCar(TCmsShoppingCar customerBuyReq);

    /**
     * 修改购物车
     * @param 
     * @return
     */
    ResponseMessage updateBuyCar(TCmsShoppingCar customerBuyReq);
    
}
