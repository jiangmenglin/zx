package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.OperRecord;
import com.zx.evpop.jdbc.entity.OperRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperRecordMapper {
    int countByExample(OperRecordExample example);

    int deleteByPrimaryKey(Integer tborId);

    int insert(OperRecord record);

    int insertSelective(OperRecord record);

    List<OperRecord> selectByExample(OperRecordExample example);

    OperRecord selectByPrimaryKey(Integer tborId);

    int updateByExampleSelective(@Param("record") OperRecord record, @Param("example") OperRecordExample example);

    int updateByExample(@Param("record") OperRecord record, @Param("example") OperRecordExample example);

    int updateByPrimaryKeySelective(OperRecord record);

    int updateByPrimaryKey(OperRecord record);
}