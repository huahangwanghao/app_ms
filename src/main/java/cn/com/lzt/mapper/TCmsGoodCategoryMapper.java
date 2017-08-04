package cn.com.lzt.mapper;

import cn.com.lzt.model.TCmsGoodCategory;
import cn.com.lzt.model.TCmsGoodCategoryCriteria;
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
}