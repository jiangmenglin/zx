package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.LongInstructions;
import com.zx.evpop.jdbc.entity.LongInstructionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LongInstructionsMapper {
    int countByExample(LongInstructionsExample example);

    int deleteByPrimaryKey(Long tbliId);

    int insert(LongInstructions record);

    int insertSelective(LongInstructions record);

    List<LongInstructions> selectByExampleWithBLOBs(LongInstructionsExample example);

    List<LongInstructions> selectByExample(LongInstructionsExample example);

    LongInstructions selectByPrimaryKey(Long tbliId);

    int updateByExampleSelective(@Param("record") LongInstructions record, @Param("example") LongInstructionsExample example);

    int updateByExampleWithBLOBs(@Param("record") LongInstructions record, @Param("example") LongInstructionsExample example);

    int updateByExample(@Param("record") LongInstructions record, @Param("example") LongInstructionsExample example);

    int updateByPrimaryKeySelective(LongInstructions record);

    int updateByPrimaryKeyWithBLOBs(LongInstructions record);

    int updateByPrimaryKey(LongInstructions record);
}