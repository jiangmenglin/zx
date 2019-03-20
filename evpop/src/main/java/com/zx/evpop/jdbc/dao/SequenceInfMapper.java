package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.SequenceInf;
import com.zx.evpop.jdbc.entity.SequenceInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceInfMapper {
    int countByExample(SequenceInfExample example);

    int deleteByPrimaryKey(@Param("seqName") String seqName, @Param("seqFeature") String seqFeature, @Param("seqValue") Integer seqValue);

    int insert(SequenceInf record);

    int insertSelective(SequenceInf record);

    List<SequenceInf> selectByExample(SequenceInfExample example);

    int updateByExampleSelective(@Param("record") SequenceInf record, @Param("example") SequenceInfExample example);

    int updateByExample(@Param("record") SequenceInf record, @Param("example") SequenceInfExample example);
}