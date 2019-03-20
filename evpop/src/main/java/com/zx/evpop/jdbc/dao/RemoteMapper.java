package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Remote;
import com.zx.evpop.jdbc.entity.RemoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemoteMapper {
    int countByExample(RemoteExample example);

    int deleteByPrimaryKey(Long tbrId);

    int insert(Remote record);

    int insertSelective(Remote record);

    List<Remote> selectByExample(RemoteExample example);

    Remote selectByPrimaryKey(Long tbrId);

    int updateByExampleSelective(@Param("record") Remote record, @Param("example") RemoteExample example);

    int updateByExample(@Param("record") Remote record, @Param("example") RemoteExample example);

    int updateByPrimaryKeySelective(Remote record);

    int updateByPrimaryKey(Remote record);
}