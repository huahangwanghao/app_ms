package com.haohai.cms.common.util;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {

	public static String formatDate(String pattern, Date date) {
		SimpleDateFormat formator = new SimpleDateFormat(pattern);
		return formator.format(date);
	}

	public static String getYmdHmsDate(Date date) {
		SimpleDateFormat ymdhms = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return ymdhms.format(date);
	}
	
	public static Date stringToDate(String dateStr,String pattern){
		Date formatDate = null;
		try {
			SimpleDateFormat sfd = new SimpleDateFormat(pattern);
			formatDate = sfd.parse(dateStr);
		} catch (Exception e) {}
		return formatDate;
	}

	public static Date getMaxDate() {
		Date maxDate = null;
		try {
			SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			maxDate = sfd.parse("9999-12-31 23:59:59");
		} catch (Exception e) {}
		return maxDate;
	}
	
	public static Timestamp getTimestamp() {
		return new Timestamp(new Date().getTime());
	}

	public static Timestamp convertToTimestamp(String strdate) {
		Timestamp ts = null;
		try {
			SimpleDateFormat ymdhm = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			ts = new Timestamp(ymdhm.parse(strdate).getTime());
		} catch (Exception e) {
		}
		return ts;
	}

	public static String getUploadpath(String basePath, String relativePath) {
		String uploadpath = basePath + relativePath;
		File file = new File(uploadpath);
		if (!file.exists())
			file.mkdirs();
		return uploadpath;
	}

}
