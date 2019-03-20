package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.OrderIndemnify;
import com.zx.evpop.jdbc.entity.OrderIndemnifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderIndemnifyMapper {
    int countByExample(OrderIndemnifyExample example);

    int deleteByPrimaryKey(Long tboiId);

    int insert(OrderIndemnify record);

    int insertSelective(OrderIndemnify record);

    List<OrderIndemnify> selectByExample(OrderIndemnifyExample example);

    OrderIndemnify selectByPrimaryKey(Long tboiId);

    int updateByExampleSelective(@Param("record") OrderIndemnify record, @Param("example") OrderIndemnifyExample example);

    int updateByExample(@Param("record") OrderIndemnify record, @Param("example") OrderIndemnifyExample example);

    int updateByPrimaryKeySelective(OrderIndemnify record);

    int updateByPrimaryKey(OrderIndemnify record);
}