package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Annual;
import com.zx.evpop.jdbc.entity.AnnualExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnnualMapper {
    int countByExample(AnnualExample example);

    int deleteByPrimaryKey(Integer tbaiId);

    int insert(Annual record);

    int insertSelective(Annual record);

    List<Annual> selectByExample(AnnualExample example);

    Annual selectByPrimaryKey(Integer tbaiId);

    int updateByExampleSelective(@Param("record") Annual record, @Param("example") AnnualExample example);

    int updateByExample(@Param("record") Annual record, @Param("example") AnnualExample example);

    int updateByPrimaryKeySelective(Annual record);

    int updateByPrimaryKey(Annual record);
}