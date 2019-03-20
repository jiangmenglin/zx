package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.AppProtocol;
import com.zx.evpop.jdbc.entity.AppProtocolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppProtocolMapper {
    int countByExample(AppProtocolExample example);

    int deleteByPrimaryKey(Long tbapId);

    int insert(AppProtocol record);

    int insertSelective(AppProtocol record);

    List<AppProtocol> selectByExampleWithBLOBs(AppProtocolExample example);

    List<AppProtocol> selectByExample(AppProtocolExample example);

    AppProtocol selectByPrimaryKey(Long tbapId);

    int updateByExampleSelective(@Param("record") AppProtocol record, @Param("example") AppProtocolExample example);

    int updateByExampleWithBLOBs(@Param("record") AppProtocol record, @Param("example") AppProtocolExample example);

    int updateByExample(@Param("record") AppProtocol record, @Param("example") AppProtocolExample example);

    int updateByPrimaryKeySelective(AppProtocol record);

    int updateByPrimaryKeyWithBLOBs(AppProtocol record);

    int updateByPrimaryKey(AppProtocol record);
}