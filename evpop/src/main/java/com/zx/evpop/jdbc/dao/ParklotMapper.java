package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Parklot;
import com.zx.evpop.jdbc.entity.ParklotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParklotMapper {
    int countByExample(ParklotExample example);

    int deleteByPrimaryKey(Integer tbpId);

    int insert(Parklot record);

    int insertSelective(Parklot record);

    List<Parklot> selectByExample(ParklotExample example);

    Parklot selectByPrimaryKey(Integer tbpId);

    int updateByExampleSelective(@Param("record") Parklot record, @Param("example") ParklotExample example);

    int updateByExample(@Param("record") Parklot record, @Param("example") ParklotExample example);

    int updateByPrimaryKeySelective(Parklot record);

    int updateByPrimaryKey(Parklot record);
}