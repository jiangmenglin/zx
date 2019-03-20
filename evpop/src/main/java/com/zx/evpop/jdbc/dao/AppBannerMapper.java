package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.AppBanner;
import com.zx.evpop.jdbc.entity.AppBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppBannerMapper {
    int countByExample(AppBannerExample example);

    int deleteByPrimaryKey(Long tbabId);

    int insert(AppBanner record);

    int insertSelective(AppBanner record);

    List<AppBanner> selectByExampleWithBLOBs(AppBannerExample example);

    List<AppBanner> selectByExample(AppBannerExample example);

    AppBanner selectByPrimaryKey(Long tbabId);

    int updateByExampleSelective(@Param("record") AppBanner record, @Param("example") AppBannerExample example);

    int updateByExampleWithBLOBs(@Param("record") AppBanner record, @Param("example") AppBannerExample example);

    int updateByExample(@Param("record") AppBanner record, @Param("example") AppBannerExample example);

    int updateByPrimaryKeySelective(AppBanner record);

    int updateByPrimaryKeyWithBLOBs(AppBanner record);

    int updateByPrimaryKey(AppBanner record);
}