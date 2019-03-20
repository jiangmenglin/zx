package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.UnitInfo;
import com.zx.evpop.jdbc.entity.UnitInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitInfoMapper {
    int countByExample(UnitInfoExample example);

    int deleteByPrimaryKey(Integer tbuiId);

    int insert(UnitInfo record);

    int insertSelective(UnitInfo record);

    List<UnitInfo> selectByExample(UnitInfoExample example);

    UnitInfo selectByPrimaryKey(Integer tbuiId);

    int updateByExampleSelective(@Param("record") UnitInfo record, @Param("example") UnitInfoExample example);

    int updateByExample(@Param("record") UnitInfo record, @Param("example") UnitInfoExample example);

    int updateByPrimaryKeySelective(UnitInfo record);

    int updateByPrimaryKey(UnitInfo record);
}