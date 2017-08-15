package com.haohai.cms.mapper;

import com.haohai.cms.model.TCmsGoodCategory;
import com.haohai.cms.model.TCmsGoodCategoryCriteria;
import com.haohai.cms.model.dto.CmsGoodCategoryDto;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCmsGoodCategoryMapper {
    int countByExample(TCmsGoodCategoryCriteria example);

    int deleteByExample(TCmsGoodCategoryCriteria example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(TCmsGoodCategory record);

    int insertSelective(TCmsGoodCategory record);

    List<TCmsGoodCategory> selectByExample(TCmsGoodCategoryCriteria example);

    TCmsGoodCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") TCmsGoodCategory record, @Param("example") TCmsGoodCategoryCriteria example);

    int updateByExample(@Param("record") TCmsGoodCategory record, @Param("example") TCmsGoodCategoryCriteria example);

    int updateByPrimaryKeySelective(TCmsGoodCategory record);

    int updateByPrimaryKey(TCmsGoodCategory record);
    
    /**
     * 根据商品分类id查询商品分类详情
     * @param categoryId
     * @return
     */
    CmsGoodCategoryDto getCmsGoodCategoryById(Integer categoryId);
    
}