package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Oper;
import com.zx.evpop.jdbc.entity.OperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperMapper {
    int countByExample(OperExample example);

    int deleteByPrimaryKey(Long tboId);

    int insert(Oper record);

    int insertSelective(Oper record);

    List<Oper> selectByExampleWithBLOBs(OperExample example);

    List<Oper> selectByExample(OperExample example);

    Oper selectByPrimaryKey(Long tboId);

    int updateByExampleSelective(@Param("record") Oper record, @Param("example") OperExample example);

    int updateByExampleWithBLOBs(@Param("record") Oper record, @Param("example") OperExample example);

    int updateByExample(@Param("record") Oper record, @Param("example") OperExample example);

    int updateByPrimaryKeySelective(Oper record);

    int updateByPrimaryKeyWithBLOBs(Oper record);

    int updateByPrimaryKey(Oper record);
}