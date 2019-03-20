package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Rule;
import com.zx.evpop.jdbc.entity.RuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RuleMapper {
    int countByExample(RuleExample example);

    int deleteByPrimaryKey(Integer tbrId);

    int insert(Rule record);

    int insertSelective(Rule record);

    List<Rule> selectByExample(RuleExample example);

    Rule selectByPrimaryKey(Integer tbrId);

    int updateByExampleSelective(@Param("record") Rule record, @Param("example") RuleExample example);

    int updateByExample(@Param("record") Rule record, @Param("example") RuleExample example);

    int updateByPrimaryKeySelective(Rule record);

    int updateByPrimaryKey(Rule record);
}