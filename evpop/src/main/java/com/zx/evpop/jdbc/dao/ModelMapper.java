package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Model;
import com.zx.evpop.jdbc.entity.ModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelMapper {
    int countByExample(ModelExample example);

    int deleteByPrimaryKey(Integer tbmId);

    int insert(Model record);

    int insertSelective(Model record);

    List<Model> selectByExample(ModelExample example);

    Model selectByPrimaryKey(Integer tbmId);

    int updateByExampleSelective(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByExample(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);

    List<Model> selectByIdIn(List<Integer> ids);
}