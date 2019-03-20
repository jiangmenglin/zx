package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.CodeScanConfig;
import com.zx.evpop.jdbc.entity.CodeScanConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeScanConfigMapper {
    int countByExample(CodeScanConfigExample example);

    int deleteByPrimaryKey(Long tbcscId);

    int insert(CodeScanConfig record);

    int insertSelective(CodeScanConfig record);

    List<CodeScanConfig> selectByExample(CodeScanConfigExample example);

    CodeScanConfig selectByPrimaryKey(Long tbcscId);

    int updateByExampleSelective(@Param("record") CodeScanConfig record, @Param("example") CodeScanConfigExample example);

    int updateByExample(@Param("record") CodeScanConfig record, @Param("example") CodeScanConfigExample example);

    int updateByPrimaryKeySelective(CodeScanConfig record);

    int updateByPrimaryKey(CodeScanConfig record);
}