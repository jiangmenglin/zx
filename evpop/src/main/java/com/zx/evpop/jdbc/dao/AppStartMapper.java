package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.AppStart;
import com.zx.evpop.jdbc.entity.AppStartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppStartMapper {
    int countByExample(AppStartExample example);

    int deleteByPrimaryKey(Long tbasId);

    int insert(AppStart record);

    int insertSelective(AppStart record);

    List<AppStart> selectByExampleWithBLOBs(AppStartExample example);

    List<AppStart> selectByExample(AppStartExample example);

    AppStart selectByPrimaryKey(Long tbasId);

    int updateByExampleSelective(@Param("record") AppStart record, @Param("example") AppStartExample example);

    int updateByExampleWithBLOBs(@Param("record") AppStart record, @Param("example") AppStartExample example);

    int updateByExample(@Param("record") AppStart record, @Param("example") AppStartExample example);

    int updateByPrimaryKeySelective(AppStart record);

    int updateByPrimaryKeyWithBLOBs(AppStart record);

    int updateByPrimaryKey(AppStart record);
}