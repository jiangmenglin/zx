package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Problem;
import com.zx.evpop.jdbc.entity.ProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProblemMapper {
    int countByExample(ProblemExample example);

    int deleteByPrimaryKey(Long tbpId);

    int insert(Problem record);

    int insertSelective(Problem record);

    List<Problem> selectByExample(ProblemExample example);

    Problem selectByPrimaryKey(Long tbpId);

    int updateByExampleSelective(@Param("record") Problem record, @Param("example") ProblemExample example);

    int updateByExample(@Param("record") Problem record, @Param("example") ProblemExample example);

    int updateByPrimaryKeySelective(Problem record);

    int updateByPrimaryKey(Problem record);
}