package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.RecordSubject;
import com.zx.evpop.jdbc.entity.RecordSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordSubjectMapper {
    int countByExample(RecordSubjectExample example);

    int deleteByPrimaryKey(Long tbrsId);

    int insert(RecordSubject record);

    int insertSelective(RecordSubject record);

    List<RecordSubject> selectByExample(RecordSubjectExample example);

    RecordSubject selectByPrimaryKey(Long tbrsId);

    int updateByExampleSelective(@Param("record") RecordSubject record, @Param("example") RecordSubjectExample example);

    int updateByExample(@Param("record") RecordSubject record, @Param("example") RecordSubjectExample example);

    int updateByPrimaryKeySelective(RecordSubject record);

    int updateByPrimaryKey(RecordSubject record);
}