package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.OperOrder;
import com.zx.evpop.jdbc.entity.OperOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperOrderMapper {
    int countByExample(OperOrderExample example);

    int deleteByPrimaryKey(Long tbooId);

    int insert(OperOrder record);

    int insertSelective(OperOrder record);

    List<OperOrder> selectByExample(OperOrderExample example);

    OperOrder selectByPrimaryKey(Long tbooId);

    int updateByExampleSelective(@Param("record") OperOrder record, @Param("example") OperOrderExample example);

    int updateByExample(@Param("record") OperOrder record, @Param("example") OperOrderExample example);

    int updateByPrimaryKeySelective(OperOrder record);

    int updateByPrimaryKey(OperOrder record);
}