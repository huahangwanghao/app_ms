package cn.com.lzt.mapper;

import cn.com.lzt.model.TCmsGood;
import cn.com.lzt.model.TCmsGoodCriteria;
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
}