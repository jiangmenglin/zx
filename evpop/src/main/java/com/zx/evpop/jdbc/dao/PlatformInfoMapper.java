package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.PlatformInfo;
import com.zx.evpop.jdbc.entity.PlatformInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatformInfoMapper {
    int countByExample(PlatformInfoExample example);

    int deleteByPrimaryKey(Integer platformId);

    int insert(PlatformInfo record);

    int insertSelective(PlatformInfo record);

    List<PlatformInfo> selectByExample(PlatformInfoExample example);

    PlatformInfo selectByPrimaryKey(Integer platformId);

    int updateByExampleSelective(@Param("record") PlatformInfo record, @Param("example") PlatformInfoExample example);

    int updateByExample(@Param("record") PlatformInfo record, @Param("example") PlatformInfoExample example);

    int updateByPrimaryKeySelective(PlatformInfo record);

    int updateByPrimaryKey(PlatformInfo record);
}