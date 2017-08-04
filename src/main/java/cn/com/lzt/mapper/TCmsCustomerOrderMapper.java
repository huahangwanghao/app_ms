package cn.com.lzt.mapper;

import cn.com.lzt.model.TCmsCustomerOrder;
import cn.com.lzt.model.TCmsCustomerOrderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}