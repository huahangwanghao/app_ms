package cn.com.lzt.common.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileUtil {

	/**
	 * 删除图片
	 * 
	 * @param imgurl
	 */
	public static void delImg(String imgurl) {
		if (StringUtils.isNotEmpty(imgurl)) {
			File oldphoto = new File(imgurl);
			if (oldphoto.exists()) {
				oldphoto.delete();
			}
		}
	}

	/**
	 * 上传图片
	 * @param file
	 * @param basePath
	 * @param relativePath
	 * @return
	 * @throws Exception
	 */
	public static String uploadImg(MultipartFile file, String basePath,String relativePath)
			throws Exception {
		Random random = new Random();
		String imgname = file.getOriginalFilename();
		String imgformat = imgname.substring(imgname.lastIndexOf("."),
				imgname.length());
		String filename = new SimpleDateFormat("yyyyMMddHHmmsssss")
				.format(new Date()) + random.nextInt(10000) + imgformat;
		// TOMCAT上传路径
		String filepath = StringUtil.getUploadpath(basePath,relativePath);
		File path = new File(filepath);
		if (!path.exists()) {
			path.mkdirs();
		}
		file.transferTo(new File(filepath + filename));
		return relativePath + filename;
	}

}
