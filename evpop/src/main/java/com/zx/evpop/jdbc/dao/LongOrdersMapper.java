package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.LongOrders;
import com.zx.evpop.jdbc.entity.LongOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LongOrdersMapper {
    int countByExample(LongOrdersExample example);

    int deleteByPrimaryKey(Long tbloId);

    int insert(LongOrders record);

    int insertSelective(LongOrders record);

    List<LongOrders> selectByExampleWithBLOBs(LongOrdersExample example);

    List<LongOrders> selectByExample(LongOrdersExample example);

    LongOrders selectByPrimaryKey(Long tbloId);

    int updateByExampleSelective(@Param("record") LongOrders record, @Param("example") LongOrdersExample example);

    int updateByExampleWithBLOBs(@Param("record") LongOrders record, @Param("example") LongOrdersExample example);

    int updateByExample(@Param("record") LongOrders record, @Param("example") LongOrdersExample example);

    int updateByPrimaryKeySelective(LongOrders record);

    int updateByPrimaryKeyWithBLOBs(LongOrders record);

    int updateByPrimaryKey(LongOrders record);
}