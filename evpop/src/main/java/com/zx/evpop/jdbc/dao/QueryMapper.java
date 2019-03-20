package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Query;
import com.zx.evpop.jdbc.entity.QueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueryMapper {
    int countByExample(QueryExample example);

    int deleteByPrimaryKey(Long sqId);

    int insert(Query record);

    int insertSelective(Query record);

    List<Query> selectByExampleWithBLOBs(QueryExample example);

    List<Query> selectByExample(QueryExample example);

    Query selectByPrimaryKey(Long sqId);

    int updateByExampleSelective(@Param("record") Query record, @Param("example") QueryExample example);

    int updateByExampleWithBLOBs(@Param("record") Query record, @Param("example") QueryExample example);

    int updateByExample(@Param("record") Query record, @Param("example") QueryExample example);

    int updateByPrimaryKeySelective(Query record);

    int updateByPrimaryKeyWithBLOBs(Query record);

    int updateByPrimaryKey(Query record);
}