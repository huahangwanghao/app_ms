package com.haohai.cms.mapper;

import com.haohai.cms.model.TCmsGoodRead;
import com.haohai.cms.model.TCmsGoodReadCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCmsGoodReadMapper {
    int countByExample(TCmsGoodReadCriteria example);

    int deleteByExample(TCmsGoodReadCriteria example);

    int deleteByPrimaryKey(Long readId);

    int insert(TCmsGoodRead record);

    int insertSelective(TCmsGoodRead record);

    List<TCmsGoodRead> selectByExample(TCmsGoodReadCriteria example);

    TCmsGoodRead selectByPrimaryKey(Long readId);

    int updateByExampleSelective(@Param("record") TCmsGoodRead record, @Param("example") TCmsGoodReadCriteria example);

    int updateByExample(@Param("record") TCmsGoodRead record, @Param("example") TCmsGoodReadCriteria example);

    int updateByPrimaryKeySelective(TCmsGoodRead record);

    int updateByPrimaryKey(TCmsGoodRead record);
}