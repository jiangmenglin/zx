package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.WebBanner;
import com.zx.evpop.jdbc.entity.WebBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebBannerMapper {
    int countByExample(WebBannerExample example);

    int deleteByPrimaryKey(Long tbwbId);

    int insert(WebBanner record);

    int insertSelective(WebBanner record);

    List<WebBanner> selectByExampleWithBLOBs(WebBannerExample example);

    List<WebBanner> selectByExample(WebBannerExample example);

    WebBanner selectByPrimaryKey(Long tbwbId);

    int updateByExampleSelective(@Param("record") WebBanner record, @Param("example") WebBannerExample example);

    int updateByExampleWithBLOBs(@Param("record") WebBanner record, @Param("example") WebBannerExample example);

    int updateByExample(@Param("record") WebBanner record, @Param("example") WebBannerExample example);

    int updateByPrimaryKeySelective(WebBanner record);

    int updateByPrimaryKeyWithBLOBs(WebBanner record);

    int updateByPrimaryKey(WebBanner record);
}