package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.LongFaulttype;
import com.zx.evpop.jdbc.entity.LongFaulttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LongFaulttypeMapper {
    int countByExample(LongFaulttypeExample example);

    int deleteByPrimaryKey(Long tblfId);

    int insert(LongFaulttype record);

    int insertSelective(LongFaulttype record);

    List<LongFaulttype> selectByExample(LongFaulttypeExample example);

    LongFaulttype selectByPrimaryKey(Long tblfId);

    int updateByExampleSelective(@Param("record") LongFaulttype record, @Param("example") LongFaulttypeExample example);

    int updateByExample(@Param("record") LongFaulttype record, @Param("example") LongFaulttypeExample example);

    int updateByPrimaryKeySelective(LongFaulttype record);

    int updateByPrimaryKey(LongFaulttype record);
}