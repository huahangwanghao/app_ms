package com.haohai.cms.mapper;

import com.haohai.cms.model.TCmsShoppingCar;
import com.haohai.cms.model.TCmsShoppingCarCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCmsShoppingCarMapper {
    int countByExample(TCmsShoppingCarCriteria example);

    int deleteByExample(TCmsShoppingCarCriteria example);

    int deleteByPrimaryKey(Integer carId);

    int insert(TCmsShoppingCar record);

    int insertSelective(TCmsShoppingCar record);

    List<TCmsShoppingCar> selectByExample(TCmsShoppingCarCriteria example);

    TCmsShoppingCar selectByPrimaryKey(Integer carId);

    int updateByExampleSelective(@Param("record") TCmsShoppingCar record, @Param("example") TCmsShoppingCarCriteria example);

    int updateByExample(@Param("record") TCmsShoppingCar record, @Param("example") TCmsShoppingCarCriteria example);

    int updateByPrimaryKeySelective(TCmsShoppingCar record);

    int updateByPrimaryKey(TCmsShoppingCar record);
}