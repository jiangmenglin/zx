package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Restriction;
import com.zx.evpop.jdbc.entity.RestrictionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RestrictionMapper {
    int countByExample(RestrictionExample example);

    int deleteByPrimaryKey(Long tbrId);

    int insert(Restriction record);

    int insertSelective(Restriction record);

    List<Restriction> selectByExample(RestrictionExample example);

    Restriction selectByPrimaryKey(Long tbrId);

    int updateByExampleSelective(@Param("record") Restriction record, @Param("example") RestrictionExample example);

    int updateByExample(@Param("record") Restriction record, @Param("example") RestrictionExample example);

    int updateByPrimaryKeySelective(Restriction record);

    int updateByPrimaryKey(Restriction record);
}