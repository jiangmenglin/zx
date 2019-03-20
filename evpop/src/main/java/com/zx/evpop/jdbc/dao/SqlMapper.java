package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Sql;
import com.zx.evpop.jdbc.entity.SqlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SqlMapper {
    int countByExample(SqlExample example);

    int deleteByPrimaryKey(Long ssId);

    int insert(Sql record);

    int insertSelective(Sql record);

    List<Sql> selectByExample(SqlExample example);

    Sql selectByPrimaryKey(Long ssId);

    int updateByExampleSelective(@Param("record") Sql record, @Param("example") SqlExample example);

    int updateByExample(@Param("record") Sql record, @Param("example") SqlExample example);

    int updateByPrimaryKeySelective(Sql record);

    int updateByPrimaryKey(Sql record);
}