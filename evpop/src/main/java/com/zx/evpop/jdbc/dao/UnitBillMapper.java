package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.UnitBill;
import com.zx.evpop.jdbc.entity.UnitBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitBillMapper {
    int countByExample(UnitBillExample example);

    int deleteByPrimaryKey(Long tbubId);

    int insert(UnitBill record);

    int insertSelective(UnitBill record);

    List<UnitBill> selectByExample(UnitBillExample example);

    UnitBill selectByPrimaryKey(Long tbubId);

    int updateByExampleSelective(@Param("record") UnitBill record, @Param("example") UnitBillExample example);

    int updateByExample(@Param("record") UnitBill record, @Param("example") UnitBillExample example);

    int updateByPrimaryKeySelective(UnitBill record);

    int updateByPrimaryKey(UnitBill record);
}