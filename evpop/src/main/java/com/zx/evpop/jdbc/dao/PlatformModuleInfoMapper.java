package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.PlatformModuleInfo;
import com.zx.evpop.jdbc.entity.PlatformModuleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatformModuleInfoMapper {
    int countByExample(PlatformModuleInfoExample example);

    int deleteByPrimaryKey(Integer moduleId);

    int insert(PlatformModuleInfo record);

    int insertSelective(PlatformModuleInfo record);

    List<PlatformModuleInfo> selectByExample(PlatformModuleInfoExample example);

    PlatformModuleInfo selectByPrimaryKey(Integer moduleId);

    int updateByExampleSelective(@Param("record") PlatformModuleInfo record, @Param("example") PlatformModuleInfoExample example);

    int updateByExample(@Param("record") PlatformModuleInfo record, @Param("example") PlatformModuleInfoExample example);

    int updateByPrimaryKeySelective(PlatformModuleInfo record);

    int updateByPrimaryKey(PlatformModuleInfo record);
}