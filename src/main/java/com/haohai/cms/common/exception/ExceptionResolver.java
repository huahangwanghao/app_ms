package com.haohai.cms.common.exception;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/** 
* @author WH 作者 E-mail: 
* @version 创建时间：2017年8月21日 下午7:53:28 
* 类说明  异常解析器，对于系统的异常返回给前端异常代码。
*/
public class ExceptionResolver implements HandlerExceptionResolver  {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionResolver.class);
    @Override
    public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse response, Object arg2, Exception arg3) {
        // TODO Auto-generated method stub
        try {
            response.setCharacterEncoding("UTF-8");  
            response.setContentType("application/json; charset=utf-8"); 
            PrintWriter writer = response.getWriter();
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("code", 9999);
            jsonObject.put("msg", "API服务器异常，请稍后再试。");
            logger.error("API服务器异常:", arg3);
            writer.write(jsonObject.toJSONString());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            logger.error("异常拦截器报错:", e);
        }
        return null;
    }

}
 