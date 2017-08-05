package com.haohai.cms.mapper;

import com.haohai.cms.model.TCmsCustomerOrder;
import com.haohai.cms.model.TCmsCustomerOrderCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TCmsCustomerOrderMapper {
    int countByExample(TCmsCustomerOrderCriteria example);

    int deleteByExample(TCmsCustomerOrderCriteria example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(TCmsCustomerOrder record);

    int insertSelective(TCmsCustomerOrder record);

    List<TCmsCustomerOrder> selectByExample(TCmsCustomerOrderCriteria example);

    TCmsCustomerOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") TCmsCustomerOrder record, @Param("example") TCmsCustomerOrderCriteria example);

    int updateByExample(@Param("record") TCmsCustomerOrder record, @Param("example") TCmsCustomerOrderCriteria example);

    int updateByPrimaryKeySelective(TCmsCustomerOrder record);

    int updateByPrimaryKey(TCmsCustomerOrder record);

    /**
     * 得到订单列表
     * @param param
     * @return
     */
    List<TCmsCustomerOrder> selectOrderList(Map<String, Object> param);
}