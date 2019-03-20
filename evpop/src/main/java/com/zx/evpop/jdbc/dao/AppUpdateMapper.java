package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.AppUpdate;
import com.zx.evpop.jdbc.entity.AppUpdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppUpdateMapper {
    int countByExample(AppUpdateExample example);

    int deleteByPrimaryKey(Integer serialNo);

    int insert(AppUpdate record);

    int insertSelective(AppUpdate record);

    List<AppUpdate> selectByExampleWithBLOBs(AppUpdateExample example);

    List<AppUpdate> selectByExample(AppUpdateExample example);

    AppUpdate selectByPrimaryKey(Integer serialNo);

    int updateByExampleSelective(@Param("record") AppUpdate record, @Param("example") AppUpdateExample example);

    int updateByExampleWithBLOBs(@Param("record") AppUpdate record, @Param("example") AppUpdateExample example);

    int updateByExample(@Param("record") AppUpdate record, @Param("example") AppUpdateExample example);

    int updateByPrimaryKeySelective(AppUpdate record);

    int updateByPrimaryKeyWithBLOBs(AppUpdate record);

    int updateByPrimaryKey(AppUpdate record);
}