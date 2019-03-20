package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Servicing;
import com.zx.evpop.jdbc.entity.ServicingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicingMapper {
    int countByExample(ServicingExample example);

    int deleteByPrimaryKey(Long tbsId);

    int insert(Servicing record);

    int insertSelective(Servicing record);

    List<Servicing> selectByExample(ServicingExample example);

    Servicing selectByPrimaryKey(Long tbsId);

    int updateByExampleSelective(@Param("record") Servicing record, @Param("example") ServicingExample example);

    int updateByExample(@Param("record") Servicing record, @Param("example") ServicingExample example);

    int updateByPrimaryKeySelective(Servicing record);

    int updateByPrimaryKey(Servicing record);
}