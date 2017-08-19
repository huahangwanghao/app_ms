package com.haohai.cms.mapper;

import com.haohai.cms.model.TCmsGoodCategoryTag;
import com.haohai.cms.model.TCmsGoodCategoryTagCriteria;
import com.haohai.cms.model.dto.CmsGoodCategoryTagDto;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCmsGoodCategoryTagMapper {
    int countByExample(TCmsGoodCategoryTagCriteria example);

    int deleteByExample(TCmsGoodCategoryTagCriteria example);

    int deleteByPrimaryKey(Integer goodCategoryTagId);

    int insert(TCmsGoodCategoryTag record);

    int insertSelective(TCmsGoodCategoryTag record);

    List<TCmsGoodCategoryTag> selectByExample(TCmsGoodCategoryTagCriteria example);

    TCmsGoodCategoryTag selectByPrimaryKey(Integer goodCategoryTagId);

    int updateByExampleSelective(@Param("record") TCmsGoodCategoryTag record, @Param("example") TCmsGoodCategoryTagCriteria example);

    int updateByExample(@Param("record") TCmsGoodCategoryTag record, @Param("example") TCmsGoodCategoryTagCriteria example);

    int updateByPrimaryKeySelective(TCmsGoodCategoryTag record);

    int updateByPrimaryKey(TCmsGoodCategoryTag record);
    
    /**
     * 批量插入商品分类和标签的关系
     * @param records
     * @return
     */
    int batchInsert(@Param("gcTags") List<TCmsGoodCategoryTag> records);
    
    /**
     * 根据商品分类id查询商品分类标签树
     * @param categoryId
     * @return
     */
    List<CmsGoodCategoryTagDto> selectGoodCategoryTagByCategoryId(Integer categoryId);
    
}