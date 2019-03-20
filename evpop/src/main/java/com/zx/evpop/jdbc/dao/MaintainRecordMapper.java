package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.MaintainRecord;
import com.zx.evpop.jdbc.entity.MaintainRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintainRecordMapper {
    int countByExample(MaintainRecordExample example);

    int deleteByPrimaryKey(Long tbmrId);

    int insert(MaintainRecord record);

    int insertSelective(MaintainRecord record);

    List<MaintainRecord> selectByExample(MaintainRecordExample example);

    MaintainRecord selectByPrimaryKey(Long tbmrId);

    int updateByExampleSelective(@Param("record") MaintainRecord record, @Param("example") MaintainRecordExample example);

    int updateByExample(@Param("record") MaintainRecord record, @Param("example") MaintainRecordExample example);

    int updateByPrimaryKeySelective(MaintainRecord record);

    int updateByPrimaryKey(MaintainRecord record);
}