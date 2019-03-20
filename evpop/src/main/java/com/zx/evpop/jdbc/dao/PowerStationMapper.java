package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.PowerStation;
import com.zx.evpop.jdbc.entity.PowerStationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowerStationMapper {
    int countByExample(PowerStationExample example);

    int deleteByPrimaryKey(Long tbpsId);

    int insert(PowerStation record);

    int insertSelective(PowerStation record);

    List<PowerStation> selectByExample(PowerStationExample example);

    PowerStation selectByPrimaryKey(Long tbpsId);

    int updateByExampleSelective(@Param("record") PowerStation record, @Param("example") PowerStationExample example);

    int updateByExample(@Param("record") PowerStation record, @Param("example") PowerStationExample example);

    int updateByPrimaryKeySelective(PowerStation record);

    int updateByPrimaryKey(PowerStation record);
}