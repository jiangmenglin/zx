package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.SmsMt;
import com.zx.evpop.jdbc.entity.SmsMtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsMtMapper {
    int countByExample(SmsMtExample example);

    int deleteByPrimaryKey(Long tbsmId);

    int insert(SmsMt record);

    int insertSelective(SmsMt record);

    List<SmsMt> selectByExample(SmsMtExample example);

    SmsMt selectByPrimaryKey(Long tbsmId);

    int updateByExampleSelective(@Param("record") SmsMt record, @Param("example") SmsMtExample example);

    int updateByExample(@Param("record") SmsMt record, @Param("example") SmsMtExample example);

    int updateByPrimaryKeySelective(SmsMt record);

    int updateByPrimaryKey(SmsMt record);
}