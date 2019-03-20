package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Dope;
import com.zx.evpop.jdbc.entity.DopeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DopeMapper {
    int countByExample(DopeExample example);

    int deleteByPrimaryKey(Long tbdId);

    int insert(Dope record);

    int insertSelective(Dope record);

    List<Dope> selectByExample(DopeExample example);

    Dope selectByPrimaryKey(Long tbdId);

    int updateByExampleSelective(@Param("record") Dope record, @Param("example") DopeExample example);

    int updateByExample(@Param("record") Dope record, @Param("example") DopeExample example);

    int updateByPrimaryKeySelective(Dope record);

    int updateByPrimaryKey(Dope record);
}