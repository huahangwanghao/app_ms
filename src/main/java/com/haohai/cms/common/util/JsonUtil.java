package com.haohai.cms.common.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class JsonUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);
	private static final ObjectMapper mapper = new ObjectMapper();

	static {
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL); // 序列化取出null值
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES); // 范序列化过滤多余字段
	}

	/**
	 * 将传入的实体类对象转换为JSON格式字符串对象。对需要转换的属性字段要提供get方法，否则该字段不被转换。如果转换过程出错，则返回""。
	 *
	 * @param o
	 * @return
	 */
	public static String jsonToString(Object o) {
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
		try {
			return ow.writeValueAsString(o);
		} catch (IOException e) {
			logger.error("Error when converting a json object to a string. " + e.getMessage(), e);
			return "";
		}
	}
	
	public static String jsonToPlainString(Object o) {
		try {
			return mapper.writer().writeValueAsString(o);
		} catch (IOException e) {
			logger.error("Error when converting a json object to a string. " + e.getMessage(), e);
			return "";
		}
	}

	/**
	 * 将传入的JSON字符串对象转换为{@link JsonNode}对象。如果传入字符串格式不正确则返回null。
	 *
	 * @param s
	 * @return
	 */
	public static JsonNode stringToJson(String s) {
		try {
			ObjectReader or = mapper.reader();
			return or.readTree(s);
		} catch (IOException e) {
			logger.error("Error when converting a string to a json object. " + e.getMessage(), e);
			return null;
		}
	}

	/**
	 * 将传入的JSON字符串对象转换为对象。如果传入字符串格式不正确则返回null。
	 *
	 * @param s
	 * @return
	 */
	public static <T> T stringToObject(String s, Class<T> clazz) {
		try {
			return mapper.readValue(s.getBytes("utf-8"), clazz);
		} catch (Exception e) {
			logger.error("Error when converting a string to a object. " + e.getMessage(), e);
			return null;
		}
	}

	/**
	 * 得到前台查询的条件内容
	 * @param jsonString
	 * @param key
	 * @return
	 */
	public static String getQueryValue(String jsonString,String key){
		JSONObject json=JSONObject.parseObject(jsonString);
		String value=json.getString(key);
		return value;
	}

	/**
	 * 得到分页信息返回给前端的jsonobject对象
	 * @param total
	 * @param list
	 * @return
	 */
	public static JSONObject getPageInfo2JsonObject(long total,List list){
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("total",total);
		JSONArray jsonArray=new JSONArray();
		jsonArray.addAll(list);
		jsonObject.put("rows",jsonArray);
		return jsonObject;
	}
}
