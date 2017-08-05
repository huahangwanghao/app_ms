package com.haohai.cms.mapper;

import com.haohai.cms.model.TCmsCustomerAddress;
import com.haohai.cms.model.TCmsCustomerAddressCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCmsCustomerAddressMapper {
    int countByExample(TCmsCustomerAddressCriteria example);

    int deleteByExample(TCmsCustomerAddressCriteria example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(TCmsCustomerAddress record);

    int insertSelective(TCmsCustomerAddress record);

    List<TCmsCustomerAddress> selectByExample(TCmsCustomerAddressCriteria example);

    TCmsCustomerAddress selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") TCmsCustomerAddress record, @Param("example") TCmsCustomerAddressCriteria example);

    int updateByExample(@Param("record") TCmsCustomerAddress record, @Param("example") TCmsCustomerAddressCriteria example);

    int updateByPrimaryKeySelective(TCmsCustomerAddress record);

    int updateByPrimaryKey(TCmsCustomerAddress record);
}