package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.CashRecord;
import com.zx.evpop.jdbc.entity.CashRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashRecordMapper {
    int countByExample(CashRecordExample example);

    int deleteByPrimaryKey(Long tbcrId);

    int insert(CashRecord record);

    int insertSelective(CashRecord record);

    List<CashRecord> selectByExample(CashRecordExample example);

    CashRecord selectByPrimaryKey(Long tbcrId);

    int updateByExampleSelective(@Param("record") CashRecord record, @Param("example") CashRecordExample example);

    int updateByExample(@Param("record") CashRecord record, @Param("example") CashRecordExample example);

    int updateByPrimaryKeySelective(CashRecord record);

    int updateByPrimaryKey(CashRecord record);
}