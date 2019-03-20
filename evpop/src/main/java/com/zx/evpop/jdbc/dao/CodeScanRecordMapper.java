package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.CodeScanRecord;
import com.zx.evpop.jdbc.entity.CodeScanRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeScanRecordMapper {
    int countByExample(CodeScanRecordExample example);

    int deleteByPrimaryKey(Long tbcsrId);

    int insert(CodeScanRecord record);

    int insertSelective(CodeScanRecord record);

    List<CodeScanRecord> selectByExample(CodeScanRecordExample example);

    CodeScanRecord selectByPrimaryKey(Long tbcsrId);

    int updateByExampleSelective(@Param("record") CodeScanRecord record, @Param("example") CodeScanRecordExample example);

    int updateByExample(@Param("record") CodeScanRecord record, @Param("example") CodeScanRecordExample example);

    int updateByPrimaryKeySelective(CodeScanRecord record);

    int updateByPrimaryKey(CodeScanRecord record);
}