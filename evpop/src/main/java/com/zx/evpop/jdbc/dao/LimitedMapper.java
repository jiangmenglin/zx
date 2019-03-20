package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Limited;
import com.zx.evpop.jdbc.entity.LimitedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LimitedMapper {
    int countByExample(LimitedExample example);

    int deleteByPrimaryKey(Long slId);

    int insert(Limited record);

    int insertSelective(Limited record);

    List<Limited> selectByExample(LimitedExample example);

    Limited selectByPrimaryKey(Long slId);

    int updateByExampleSelective(@Param("record") Limited record, @Param("example") LimitedExample example);

    int updateByExample(@Param("record") Limited record, @Param("example") LimitedExample example);

    int updateByPrimaryKeySelective(Limited record);

    int updateByPrimaryKey(Limited record);
}