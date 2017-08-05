package com.haohai.cms.mapper;

import com.haohai.cms.model.TCmsCustomer;
import com.haohai.cms.model.TCmsCustomerCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCmsCustomerMapper {
    int countByExample(TCmsCustomerCriteria example);

    int deleteByExample(TCmsCustomerCriteria example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(TCmsCustomer record);

    int insertSelective(TCmsCustomer record);

    List<TCmsCustomer> selectByExample(TCmsCustomerCriteria example);

    TCmsCustomer selectByPrimaryKey(Integer customerId);

    int updateByExampleSelective(@Param("record") TCmsCustomer record, @Param("example") TCmsCustomerCriteria example);

    int updateByExample(@Param("record") TCmsCustomer record, @Param("example") TCmsCustomerCriteria example);

    int updateByPrimaryKeySelective(TCmsCustomer record);

    int updateByPrimaryKey(TCmsCustomer record);
}