package com.haohai.cms.mapper;

import com.haohai.cms.model.TCmsGoodTag;
import com.haohai.cms.model.TCmsGoodTagCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCmsGoodTagMapper {
    int countByExample(TCmsGoodTagCriteria example);

    int deleteByExample(TCmsGoodTagCriteria example);

    int deleteByPrimaryKey(Integer goodTagId);

    int insert(TCmsGoodTag record);

    int insertSelective(TCmsGoodTag record);

    List<TCmsGoodTag> selectByExample(TCmsGoodTagCriteria example);

    TCmsGoodTag selectByPrimaryKey(Integer goodTagId);

    int updateByExampleSelective(@Param("record") TCmsGoodTag record, @Param("example") TCmsGoodTagCriteria example);

    int updateByExample(@Param("record") TCmsGoodTag record, @Param("example") TCmsGoodTagCriteria example);

    int updateByPrimaryKeySelective(TCmsGoodTag record);

    int updateByPrimaryKey(TCmsGoodTag record);
}