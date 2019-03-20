package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.InterfaceRequest;
import com.zx.evpop.jdbc.entity.InterfaceRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterfaceRequestMapper {
    int countByExample(InterfaceRequestExample example);

    int deleteByPrimaryKey(String requestNo);

    int insert(InterfaceRequest record);

    int insertSelective(InterfaceRequest record);

    List<InterfaceRequest> selectByExampleWithBLOBs(InterfaceRequestExample example);

    List<InterfaceRequest> selectByExample(InterfaceRequestExample example);

    InterfaceRequest selectByPrimaryKey(String requestNo);

    int updateByExampleSelective(@Param("record") InterfaceRequest record, @Param("example") InterfaceRequestExample example);

    int updateByExampleWithBLOBs(@Param("record") InterfaceRequest record, @Param("example") InterfaceRequestExample example);

    int updateByExample(@Param("record") InterfaceRequest record, @Param("example") InterfaceRequestExample example);

    int updateByPrimaryKeySelective(InterfaceRequest record);

    int updateByPrimaryKeyWithBLOBs(InterfaceRequest record);

    int updateByPrimaryKey(InterfaceRequest record);
}