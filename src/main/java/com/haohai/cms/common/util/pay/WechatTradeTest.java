package com.haohai.cms.common.util.pay;


import com.alibaba.fastjson.JSON;
import com.haohai.cms.common.util.pay.wechatpay.WechatConfig;
import com.haohai.cms.common.util.pay.wechatpay.entity.WechatRefund;
import com.haohai.cms.common.util.pay.wechatpay.entity.WechatRefundQuery;
import com.haohai.cms.common.util.pay.wechatpay.entity.WechatUnifiedOrder;


/**
 * @author Niu Li
 * @date 2016/10/29
 */
public class WechatTradeTest {

    public static void main(String[] args) {
        new WechatTradeTest().testunifiedOrder();
    }
    
    /**
     * 测试下单
     */
    public void testunifiedOrder(){
        WechatUnifiedOrder request = new WechatUnifiedOrder();
        request.setBody("测试商品");
        request.setDetail("一个好商品");
        request.setGoods_tag("测试");
        request.setOut_trade_no(System.currentTimeMillis()+"");
        request.setFee_type("CNY");
        request.setTotal_fee(1000);
        request.setSpbill_create_ip("127.0.0.1");
        request.setTime_start(System.currentTimeMillis()+"");
        request.setLimit_pay("cera");
        WechatUnifiedOrder.Response response = WechatConfig.getInstance().unifiedOrder(request);
        System.out.println(JSON.toJSONString(response));
    }

    /**
     * 退款
     */
    public void refund(){
        WechatRefund refund = new WechatRefund();
        refund.setTransaction_id("4006602001201610318291951971");
        refund.setOut_refund_no(System.currentTimeMillis()+"");
        refund.setTotal_fee(1858);
        refund.setRefund_fee(1858);
        refund.setOp_user_id("NIULI");
        refund.setRefund_account("REFUND_SOURCE_UNSETTLED_FUNDS");
        WechatRefund.Response response = WechatConfig.getInstance().refund(refund);
        System.out.println(JSON.toJSONString(response));
    }

    /**
     * 退款查询
     */
    public void testRefundQuery(){
        WechatRefundQuery refundQuery = new WechatRefundQuery();
        refundQuery.setTransaction_id("4007522001201610308199783330");
        WechatRefundQuery.Response response = WechatConfig.getInstance().refundQuery(refundQuery);
        System.out.println(JSON.toJSONString(response));
    }
}
