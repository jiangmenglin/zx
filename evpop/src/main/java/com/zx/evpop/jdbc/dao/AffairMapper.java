package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Affair;
import com.zx.evpop.jdbc.entity.AffairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AffairMapper {
    int countByExample(AffairExample example);

    int deleteByPrimaryKey(Integer tbaId);

    int insert(Affair record);

    int insertSelective(Affair record);

    List<Affair> selectByExample(AffairExample example);

    Affair selectByPrimaryKey(Integer tbaId);

    int updateByExampleSelective(@Param("record") Affair record, @Param("example") AffairExample example);

    int updateByExample(@Param("record") Affair record, @Param("example") AffairExample example);

    int updateByPrimaryKeySelective(Affair record);

    int updateByPrimaryKey(Affair record);
}