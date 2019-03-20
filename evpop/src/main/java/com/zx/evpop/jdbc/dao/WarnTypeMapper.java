package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.WarnType;
import com.zx.evpop.jdbc.entity.WarnTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarnTypeMapper {
    int countByExample(WarnTypeExample example);

    int deleteByPrimaryKey(Long tbwtId);

    int insert(WarnType record);

    int insertSelective(WarnType record);

    List<WarnType> selectByExample(WarnTypeExample example);

    WarnType selectByPrimaryKey(Long tbwtId);

    int updateByExampleSelective(@Param("record") WarnType record, @Param("example") WarnTypeExample example);

    int updateByExample(@Param("record") WarnType record, @Param("example") WarnTypeExample example);

    int updateByPrimaryKeySelective(WarnType record);

    int updateByPrimaryKey(WarnType record);
}