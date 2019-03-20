package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Retroact;
import com.zx.evpop.jdbc.entity.RetroactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RetroactMapper {
    int countByExample(RetroactExample example);

    int deleteByPrimaryKey(Integer tbrId);

    int insert(Retroact record);

    int insertSelective(Retroact record);

    List<Retroact> selectByExample(RetroactExample example);

    Retroact selectByPrimaryKey(Integer tbrId);

    int updateByExampleSelective(@Param("record") Retroact record, @Param("example") RetroactExample example);

    int updateByExample(@Param("record") Retroact record, @Param("example") RetroactExample example);

    int updateByPrimaryKeySelective(Retroact record);

    int updateByPrimaryKey(Retroact record);
}