package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.InterfaceResponse;
import com.zx.evpop.jdbc.entity.InterfaceResponseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterfaceResponseMapper {
    int countByExample(InterfaceResponseExample example);

    int deleteByPrimaryKey(String responseNo);

    int insert(InterfaceResponse record);

    int insertSelective(InterfaceResponse record);

    List<InterfaceResponse> selectByExampleWithBLOBs(InterfaceResponseExample example);

    List<InterfaceResponse> selectByExample(InterfaceResponseExample example);

    InterfaceResponse selectByPrimaryKey(String responseNo);

    int updateByExampleSelective(@Param("record") InterfaceResponse record, @Param("example") InterfaceResponseExample example);

    int updateByExampleWithBLOBs(@Param("record") InterfaceResponse record, @Param("example") InterfaceResponseExample example);

    int updateByExample(@Param("record") InterfaceResponse record, @Param("example") InterfaceResponseExample example);

    int updateByPrimaryKeySelective(InterfaceResponse record);

    int updateByPrimaryKeyWithBLOBs(InterfaceResponse record);

    int updateByPrimaryKey(InterfaceResponse record);
}