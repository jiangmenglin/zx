package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.UnitGroup;
import com.zx.evpop.jdbc.entity.UnitGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitGroupMapper {
    int countByExample(UnitGroupExample example);

    int deleteByPrimaryKey(Integer tbugId);

    int insert(UnitGroup record);

    int insertSelective(UnitGroup record);

    List<UnitGroup> selectByExampleWithBLOBs(UnitGroupExample example);

    List<UnitGroup> selectByExample(UnitGroupExample example);

    UnitGroup selectByPrimaryKey(Integer tbugId);

    int updateByExampleSelective(@Param("record") UnitGroup record, @Param("example") UnitGroupExample example);

    int updateByExampleWithBLOBs(@Param("record") UnitGroup record, @Param("example") UnitGroupExample example);

    int updateByExample(@Param("record") UnitGroup record, @Param("example") UnitGroupExample example);

    int updateByPrimaryKeySelective(UnitGroup record);

    int updateByPrimaryKeyWithBLOBs(UnitGroup record);

    int updateByPrimaryKey(UnitGroup record);
}