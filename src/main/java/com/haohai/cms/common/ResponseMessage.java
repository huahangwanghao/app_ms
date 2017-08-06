package com.haohai.cms.common;

public class ResponseMessage implements java.io.Serializable {

	private static final long serialVersionUID = 8320532078568526945L;

	private int code; // 响应码
	private String msg; // 响应信息
	private Object data; // 响应数据

	public static final ResponseMessage createSuccessMsg(Object data) {
		ResponseMessage resMsg = new ResponseMessage(0, "成功", data);
		return resMsg;
	}

	public static final ResponseMessage customMsg(String msg) {
		ResponseMessage resMsg = new ResponseMessage(1, msg, msg);
		return resMsg;
	}

	public static final ResponseMessage createErrorMsg(Exception e) {
		return new ResponseMessage(9999, "系统错误，请联系管理员！", "系统错误，请联系管理员！");
	}

	public ResponseMessage() {

	}

	public ResponseMessage(int code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public <T> T getData() {
		@SuppressWarnings("unchecked")
		T _data = (T) data;
		return _data;
	}

	public <T> void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseMessage{" +
				"code=" + code +
				", msg='" + msg + '\'' +
				", data=" + data +
				'}';
	}
}
