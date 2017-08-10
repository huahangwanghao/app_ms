package com.haohai.cms.model.dto;/**
 * Created by Administrator on 2017/8/10.
 */

/**
 * 快递查询的类
 *
 * @author WangH
 * @create 2017-08-10 10:51
 **/
public class ExpressDto {
    
    private String num;
    private String type;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ExpressDto{" +
                "num='" + num + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
