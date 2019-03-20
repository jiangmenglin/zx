package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Manage;
import com.zx.evpop.jdbc.entity.ManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageMapper {
    int countByExample(ManageExample example);

    int deleteByPrimaryKey(Integer tbmId);

    int insert(Manage record);

    int insertSelective(Manage record);

    List<Manage> selectByExample(ManageExample example);

    Manage selectByPrimaryKey(Integer tbmId);

    int updateByExampleSelective(@Param("record") Manage record, @Param("example") ManageExample example);

    int updateByExample(@Param("record") Manage record, @Param("example") ManageExample example);

    int updateByPrimaryKeySelective(Manage record);

    int updateByPrimaryKey(Manage record);
}