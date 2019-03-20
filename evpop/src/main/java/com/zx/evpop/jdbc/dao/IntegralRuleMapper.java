package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.IntegralRule;
import com.zx.evpop.jdbc.entity.IntegralRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralRuleMapper {
    int countByExample(IntegralRuleExample example);

    int deleteByPrimaryKey(Integer tbirId);

    int insert(IntegralRule record);

    int insertSelective(IntegralRule record);

    List<IntegralRule> selectByExample(IntegralRuleExample example);

    IntegralRule selectByPrimaryKey(Integer tbirId);

    int updateByExampleSelective(@Param("record") IntegralRule record, @Param("example") IntegralRuleExample example);

    int updateByExample(@Param("record") IntegralRule record, @Param("example") IntegralRuleExample example);

    int updateByPrimaryKeySelective(IntegralRule record);

    int updateByPrimaryKey(IntegralRule record);
}