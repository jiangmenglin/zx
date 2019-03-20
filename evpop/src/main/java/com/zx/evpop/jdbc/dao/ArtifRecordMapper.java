package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.ArtifRecord;
import com.zx.evpop.jdbc.entity.ArtifRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtifRecordMapper {
    int countByExample(ArtifRecordExample example);

    int deleteByPrimaryKey(Integer tbarId);

    int insert(ArtifRecord record);

    int insertSelective(ArtifRecord record);

    List<ArtifRecord> selectByExample(ArtifRecordExample example);

    ArtifRecord selectByPrimaryKey(Integer tbarId);

    int updateByExampleSelective(@Param("record") ArtifRecord record, @Param("example") ArtifRecordExample example);

    int updateByExample(@Param("record") ArtifRecord record, @Param("example") ArtifRecordExample example);

    int updateByPrimaryKeySelective(ArtifRecord record);

    int updateByPrimaryKey(ArtifRecord record);
}