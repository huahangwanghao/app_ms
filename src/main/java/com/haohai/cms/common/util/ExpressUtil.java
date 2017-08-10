package com.haohai.cms.common.util;/**
 * Created by Administrator on 2017/8/10.
 */


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.haohai.cms.common.ResponseMessage;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 快递查询工具类
 *
 * @author WangH
 * @create 2017-08-10 10:05
 **/
public class ExpressUtil {
    
    
    public static void main(String[] args) {
    queryExpress("1202516745301","YUNDA","acc1fcc66a5c4c938f7fb4333eba336b");
    }

    /**
     * 
     * @param num  "1202516745301"
     * @param type  YUNDA
     * @return
     */
    public static ResponseMessage queryExpress(String num,String type,String appcode) {
        ResponseMessage responseMessage = new ResponseMessage();
        String host = "http://jisukdcx.market.alicloudapi.com";
        String path = "/express/query";
        String method = "GET";
        //String appcode = "acc1fcc66a5c4c938f7fb4333eba336b";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("number",   num);
        querys.put("type", type);


        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            //System.out.println(response.toString());
            //获取response的body
           // System.out.println(EntityUtils.toString(response.getEntity()));
            JSONObject jsonObject= JSON.parseObject(EntityUtils.toString(response.getEntity()));
            responseMessage.setCode(jsonObject.getInteger("status"));
            responseMessage.setMsg(jsonObject.getString("msg"));
            responseMessage.setData(jsonObject.get("result"));
        } catch (Exception e) {
            e.printStackTrace();
            responseMessage=ResponseMessage.customMsg("调用查询接口异常!");
        }
        return responseMessage;
    }

   
}
