package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.AppHelp;
import com.zx.evpop.jdbc.entity.AppHelpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppHelpMapper {
    int countByExample(AppHelpExample example);

    int deleteByPrimaryKey(Long tbahId);

    int insert(AppHelp record);

    int insertSelective(AppHelp record);

    List<AppHelp> selectByExampleWithBLOBs(AppHelpExample example);

    List<AppHelp> selectByExample(AppHelpExample example);

    AppHelp selectByPrimaryKey(Long tbahId);

    int updateByExampleSelective(@Param("record") AppHelp record, @Param("example") AppHelpExample example);

    int updateByExampleWithBLOBs(@Param("record") AppHelp record, @Param("example") AppHelpExample example);

    int updateByExample(@Param("record") AppHelp record, @Param("example") AppHelpExample example);

    int updateByPrimaryKeySelective(AppHelp record);

    int updateByPrimaryKeyWithBLOBs(AppHelp record);

    int updateByPrimaryKey(AppHelp record);
}