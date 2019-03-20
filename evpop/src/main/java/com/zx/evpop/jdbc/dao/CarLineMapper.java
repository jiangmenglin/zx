package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.CarLine;
import com.zx.evpop.jdbc.entity.CarLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarLineMapper {
    int countByExample(CarLineExample example);

    int deleteByPrimaryKey(Long tbclId);

    int insert(CarLine record);

    int insertSelective(CarLine record);

    List<CarLine> selectByExample(CarLineExample example);

    CarLine selectByPrimaryKey(Long tbclId);

    int updateByExampleSelective(@Param("record") CarLine record, @Param("example") CarLineExample example);

    int updateByExample(@Param("record") CarLine record, @Param("example") CarLineExample example);

    int updateByPrimaryKeySelective(CarLine record);

    int updateByPrimaryKey(CarLine record);
}