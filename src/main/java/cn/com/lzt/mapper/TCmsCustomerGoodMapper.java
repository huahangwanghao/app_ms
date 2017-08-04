package cn.com.lzt.mapper;

import cn.com.lzt.model.TCmsCustomerGood;
import cn.com.lzt.model.TCmsCustomerGoodCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCmsCustomerGoodMapper {
    int countByExample(TCmsCustomerGoodCriteria example);

    int deleteByExample(TCmsCustomerGoodCriteria example);

    int deleteByPrimaryKey(Integer customerGoodId);

    int insert(TCmsCustomerGood record);

    int insertSelective(TCmsCustomerGood record);

    List<TCmsCustomerGood> selectByExample(TCmsCustomerGoodCriteria example);

    TCmsCustomerGood selectByPrimaryKey(Integer customerGoodId);

    int updateByExampleSelective(@Param("record") TCmsCustomerGood record, @Param("example") TCmsCustomerGoodCriteria example);

    int updateByExample(@Param("record") TCmsCustomerGood record, @Param("example") TCmsCustomerGoodCriteria example);

    int updateByPrimaryKeySelective(TCmsCustomerGood record);

    int updateByPrimaryKey(TCmsCustomerGood record);
}