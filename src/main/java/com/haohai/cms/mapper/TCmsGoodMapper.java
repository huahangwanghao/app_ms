package com.haohai.cms.mapper;

import com.haohai.cms.model.TCmsGood;
import com.haohai.cms.model.TCmsGoodCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCmsGoodMapper {
    int countByExample(TCmsGoodCriteria example);

    int deleteByExample(TCmsGoodCriteria example);

    int deleteByPrimaryKey(Integer goodId);

    int insert(TCmsGood record);

    int insertSelective(TCmsGood record);

    List<TCmsGood> selectByExample(TCmsGoodCriteria example);

    TCmsGood selectByPrimaryKey(Integer goodId);

    int updateByExampleSelective(@Param("record") TCmsGood record, @Param("example") TCmsGoodCriteria example);

    int updateByExample(@Param("record") TCmsGood record, @Param("example") TCmsGoodCriteria example);

    int updateByPrimaryKeySelective(TCmsGood record);

    int updateByPrimaryKey(TCmsGood record);

    /**
     * 批量删除
     * @param list
     * @return
     */
    int batchDeleteByIds(List<String> list);
}