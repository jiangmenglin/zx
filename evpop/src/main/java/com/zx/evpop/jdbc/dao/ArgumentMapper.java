package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Argument;
import com.zx.evpop.jdbc.entity.ArgumentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArgumentMapper {
    int countByExample(ArgumentExample example);

    int deleteByPrimaryKey(Long saId);

    int insert(Argument record);

    int insertSelective(Argument record);

    List<Argument> selectByExample(ArgumentExample example);

    Argument selectByPrimaryKey(Long saId);

    int updateByExampleSelective(@Param("record") Argument record, @Param("example") ArgumentExample example);

    int updateByExample(@Param("record") Argument record, @Param("example") ArgumentExample example);

    int updateByPrimaryKeySelective(Argument record);

    int updateByPrimaryKey(Argument record);
}