package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Host;
import com.zx.evpop.jdbc.entity.HostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostMapper {
    int countByExample(HostExample example);

    int deleteByPrimaryKey(Integer shId);

    int insert(Host record);

    int insertSelective(Host record);

    List<Host> selectByExample(HostExample example);

    Host selectByPrimaryKey(Integer shId);

    int updateByExampleSelective(@Param("record") Host record, @Param("example") HostExample example);

    int updateByExample(@Param("record") Host record, @Param("example") HostExample example);

    int updateByPrimaryKeySelective(Host record);

    int updateByPrimaryKey(Host record);
}