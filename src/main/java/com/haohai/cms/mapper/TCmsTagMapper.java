package com.haohai.cms.mapper;

import com.haohai.cms.model.TCmsTag;
import com.haohai.cms.model.TCmsTagCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCmsTagMapper {
    int countByExample(TCmsTagCriteria example);

    int deleteByExample(TCmsTagCriteria example);

    int deleteByPrimaryKey(Integer tagId);

    int insert(TCmsTag record);

    int insertSelective(TCmsTag record);

    List<TCmsTag> selectByExample(TCmsTagCriteria example);

    TCmsTag selectByPrimaryKey(Integer tagId);

    int updateByExampleSelective(@Param("record") TCmsTag record, @Param("example") TCmsTagCriteria example);

    int updateByExample(@Param("record") TCmsTag record, @Param("example") TCmsTagCriteria example);

    int updateByPrimaryKeySelective(TCmsTag record);

    int updateByPrimaryKey(TCmsTag record);
}