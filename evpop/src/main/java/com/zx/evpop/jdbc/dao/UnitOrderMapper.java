package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.UnitOrder;
import com.zx.evpop.jdbc.entity.UnitOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitOrderMapper {
    int countByExample(UnitOrderExample example);

    int deleteByPrimaryKey(Long tbuoId);

    int insert(UnitOrder record);

    int insertSelective(UnitOrder record);

    List<UnitOrder> selectByExample(UnitOrderExample example);

    UnitOrder selectByPrimaryKey(Long tbuoId);

    int updateByExampleSelective(@Param("record") UnitOrder record, @Param("example") UnitOrderExample example);

    int updateByExample(@Param("record") UnitOrder record, @Param("example") UnitOrderExample example);

    int updateByPrimaryKeySelective(UnitOrder record);

    int updateByPrimaryKey(UnitOrder record);
}