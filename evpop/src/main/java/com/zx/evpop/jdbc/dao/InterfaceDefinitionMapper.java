package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.InterfaceDefinition;
import com.zx.evpop.jdbc.entity.InterfaceDefinitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterfaceDefinitionMapper {
    int countByExample(InterfaceDefinitionExample example);

    int deleteByPrimaryKey(String serialNo);

    int insert(InterfaceDefinition record);

    int insertSelective(InterfaceDefinition record);

    List<InterfaceDefinition> selectByExampleWithBLOBs(InterfaceDefinitionExample example);

    List<InterfaceDefinition> selectByExample(InterfaceDefinitionExample example);

    InterfaceDefinition selectByPrimaryKey(String serialNo);

    int updateByExampleSelective(@Param("record") InterfaceDefinition record, @Param("example") InterfaceDefinitionExample example);

    int updateByExampleWithBLOBs(@Param("record") InterfaceDefinition record, @Param("example") InterfaceDefinitionExample example);

    int updateByExample(@Param("record") InterfaceDefinition record, @Param("example") InterfaceDefinitionExample example);

    int updateByPrimaryKeySelective(InterfaceDefinition record);

    int updateByPrimaryKeyWithBLOBs(InterfaceDefinition record);

    int updateByPrimaryKey(InterfaceDefinition record);
}