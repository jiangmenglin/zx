package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.LongQuestions;
import com.zx.evpop.jdbc.entity.LongQuestionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LongQuestionsMapper {
    int countByExample(LongQuestionsExample example);

    int deleteByPrimaryKey(Long tblqId);

    int insert(LongQuestions record);

    int insertSelective(LongQuestions record);

    List<LongQuestions> selectByExampleWithBLOBs(LongQuestionsExample example);

    List<LongQuestions> selectByExample(LongQuestionsExample example);

    LongQuestions selectByPrimaryKey(Long tblqId);

    int updateByExampleSelective(@Param("record") LongQuestions record, @Param("example") LongQuestionsExample example);

    int updateByExampleWithBLOBs(@Param("record") LongQuestions record, @Param("example") LongQuestionsExample example);

    int updateByExample(@Param("record") LongQuestions record, @Param("example") LongQuestionsExample example);

    int updateByPrimaryKeySelective(LongQuestions record);

    int updateByPrimaryKeyWithBLOBs(LongQuestions record);

    int updateByPrimaryKey(LongQuestions record);
}