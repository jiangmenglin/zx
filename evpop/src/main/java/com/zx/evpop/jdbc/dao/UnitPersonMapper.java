package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.UnitPerson;
import com.zx.evpop.jdbc.entity.UnitPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitPersonMapper {
    int countByExample(UnitPersonExample example);

    int deleteByPrimaryKey(Integer tbupId);

    int insert(UnitPerson record);

    int insertSelective(UnitPerson record);

    List<UnitPerson> selectByExample(UnitPersonExample example);

    UnitPerson selectByPrimaryKey(Integer tbupId);

    int updateByExampleSelective(@Param("record") UnitPerson record, @Param("example") UnitPersonExample example);

    int updateByExample(@Param("record") UnitPerson record, @Param("example") UnitPersonExample example);

    int updateByPrimaryKeySelective(UnitPerson record);

    int updateByPrimaryKey(UnitPerson record);
}