package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.RepairAdr;
import com.zx.evpop.jdbc.entity.RepairAdrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairAdrMapper {
    int countByExample(RepairAdrExample example);

    int deleteByPrimaryKey(Integer tbraId);

    int insert(RepairAdr record);

    int insertSelective(RepairAdr record);

    List<RepairAdr> selectByExample(RepairAdrExample example);

    RepairAdr selectByPrimaryKey(Integer tbraId);

    int updateByExampleSelective(@Param("record") RepairAdr record, @Param("example") RepairAdrExample example);

    int updateByExample(@Param("record") RepairAdr record, @Param("example") RepairAdrExample example);

    int updateByPrimaryKeySelective(RepairAdr record);

    int updateByPrimaryKey(RepairAdr record);
}