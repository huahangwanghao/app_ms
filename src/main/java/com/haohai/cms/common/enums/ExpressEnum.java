package com.haohai.cms.common.enums;

/**
 * Created by Administrator on 2017/8/10.
 */
public enum ExpressEnum {
    
    YUNDA("YUNDA","韵达"),
    ZHONGTONG("ZHONGTONG","中通"),
    SHENTONG("SHENTONG","申通"),
    SHUNFENG("SHUNFENG","顺丰"),
    YUANTONG("YUANTONG","圆通");
    
    private String code;
    private String name;

    ExpressEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ExpressEnum getByCode(String code){
        for(ExpressEnum e: values()){
            if(e.code.equals(code.toUpperCase())){
                return e;
            }
        }
        return null;
    }
}
