package cn.com.lzt.common.util;/**
 * Created by Administrator on 2017/7/21.
 */

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 文件工具类
 *
 * @author WangH
 * @create 2017-07-21 10:35
 **/
public class FileUtils {


    /**
     * MultipartFile 转换成File
     *
     * @param multfile 原文件类型
     * @return File
     * @throws IOException
     */
    public static  File multipartToFile(MultipartFile multfile) throws IOException {
        CommonsMultipartFile cf = (CommonsMultipartFile)multfile;
        //这个myfile是MultipartFile的
        DiskFileItem fi = (DiskFileItem) cf.getFileItem();
        File file = fi.getStoreLocation();
        //手动创建临时文件
        if(file.length() < 2048){
            File tmpFile = new File(System.getProperty("java.io.tmpdir") + System.getProperty("file.separator") +
                    file.getName());
            multfile.transferTo(tmpFile);
            return tmpFile;
        }
        return file;
    }

    public static String uploadImg(MultipartFile file, String relativePath)
            throws Exception {
        Random random = new Random();
        String imgname = file.getOriginalFilename();
        String imgformat = imgname.substring(imgname.lastIndexOf("."),
                imgname.length());
        String filename = new SimpleDateFormat("yyyyMMddHHmmsssss")
                .format(new Date()) + random.nextInt(10000) + imgformat;
        // TOMCAT上传路径
        String filepath = relativePath;
        File path = new File(filepath);
        if (!path.exists()) {
            path.mkdirs();
        }
        file.transferTo(new File(filepath + filename));
        return relativePath + filename;
    }
    
}
