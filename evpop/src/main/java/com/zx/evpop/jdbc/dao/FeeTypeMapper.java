package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.FeeType;
import com.zx.evpop.jdbc.entity.FeeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeeTypeMapper {
    int countByExample(FeeTypeExample example);

    int deleteByPrimaryKey(Integer tbftId);

    int insert(FeeType record);

    int insertSelective(FeeType record);

    List<FeeType> selectByExample(FeeTypeExample example);

    FeeType selectByPrimaryKey(Integer tbftId);

    int updateByExampleSelective(@Param("record") FeeType record, @Param("example") FeeTypeExample example);

    int updateByExample(@Param("record") FeeType record, @Param("example") FeeTypeExample example);

    int updateByPrimaryKeySelective(FeeType record);

    int updateByPrimaryKey(FeeType record);
}