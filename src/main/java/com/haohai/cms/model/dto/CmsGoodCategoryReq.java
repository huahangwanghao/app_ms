package com.haohai.cms.model.dto;/**
 * Created by Administrator on 2017/7/21.
 */

/**
 * 商品请求入参
 *
 * @author WangH
 * @create 2017-07-21 11:01
 **/
public class CmsGoodCategoryReq extends PageDto {

    private Integer categoryId;

    private String categoryName;

    private Integer categoryParentId;

    private String categoryLevel;

    private String categoryImgPath;

    private String categoryUrl;

    private String dataFlag;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getCategoryParentId() {
        return categoryParentId;
    }

    public void setCategoryParentId(Integer categoryParentId) {
        this.categoryParentId = categoryParentId;
    }

    public String getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(String categoryLevel) {
        this.categoryLevel = categoryLevel == null ? null : categoryLevel.trim();
    }

    public String getCategoryImgPath() {
        return categoryImgPath;
    }

    public void setCategoryImgPath(String categoryImgPath) {
        this.categoryImgPath = categoryImgPath == null ? null : categoryImgPath.trim();
    }

    public String getCategoryUrl() {
        return categoryUrl;
    }

    public void setCategoryUrl(String categoryUrl) {
        this.categoryUrl = categoryUrl == null ? null : categoryUrl.trim();
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag == null ? null : dataFlag.trim();
    }

    @Override
    public String toString() {
        return "CmsGoodCategoryReq{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryParentId=" + categoryParentId +
                ", categoryLevel='" + categoryLevel + '\'' +
                ", categoryImgPath='" + categoryImgPath + '\'' +
                ", categoryUrl='" + categoryUrl + '\'' +
                ", dataFlag='" + dataFlag + '\'' +
                '}'+super.toString();
    }
}
