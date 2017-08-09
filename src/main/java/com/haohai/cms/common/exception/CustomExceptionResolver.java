package com.haohai.cms.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomExceptionResolver  {

	private static final Logger logger = LoggerFactory.getLogger(CustomExceptionResolver.class);
	
/*	@SuppressWarnings("static-access")
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		logger.error("错误信息：", ex);
		ResponseMessage message = new ResponseMessage();
		message = message.createErrorMsg(ex);
		if (ex instanceof CustomException) {
			CustomException customException = (CustomException) ex;
			message.setMsg(customException.getErrormsg());
		}
		// JSP格式返回
		if (!(request.getHeader("accept").indexOf("application/json") > -1 || (request
				.getHeader("X-Requested-With") != null && request.getHeader(
				"X-Requested-With").indexOf("XMLHttpRequest") > -1))) {
			String viewName = determineViewName(ex, request);
			// 如果不是异步请求
			Integer statusCode = determineStatusCode(request, viewName);
			if (statusCode != null) {
				applyStatusCodeIfPossible(request, response, statusCode);
			}
			if (StringUtils.isEmpty(viewName))
				viewName = "error/500";
			ModelAndView mav = new ModelAndView();
			mav.setViewName(viewName);
			mav.addObject("errormsg", message.getMsg());
			return mav;
		} else {
			// JSON格式返回
			PrintWriter writer = null;
			try {
				response.setContentType("text/json;charset=utf-8");
				writer = response.getWriter();
				writer.print(JsonUtil.jsonToString(message));
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				if (writer !=null){
					writer.flush();
					writer.close();
					writer = null;
				}
			}
			return null;
		}
	}*/
}
