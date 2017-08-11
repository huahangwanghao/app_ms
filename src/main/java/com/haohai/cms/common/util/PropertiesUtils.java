package com.haohai.cms.common.util;/**
 * Created by Administrator on 2017/8/11.
 */

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 读取配置文件
 *
 * @author WangH
 * @create 2017-08-11 14:31
 **/
public class PropertiesUtils {
    private static ConcurrentMap<String, String> configMap = new ConcurrentHashMap<String, String>();
    private static final String DEFAULT_CONFIG_FILE = "test.properties";

    private static Properties prop = null;

    public static String getValue(String key){
        try {
            InputStream is =PropertiesUtils.class.getClassLoader().getResourceAsStream("pay.properties");// new BufferedInputStream(new FileInputStream(new File("/pay.properties")));
            Properties properties = new Properties();
            properties.load(is);
            return properties.getProperty(key);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        
        }
    }

   
    }
