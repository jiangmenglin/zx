package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Holiday;
import com.zx.evpop.jdbc.entity.HolidayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HolidayMapper {
    int countByExample(HolidayExample example);

    int deleteByPrimaryKey(Long tbhId);

    int insert(Holiday record);

    int insertSelective(Holiday record);

    List<Holiday> selectByExample(HolidayExample example);

    Holiday selectByPrimaryKey(Long tbhId);

    int updateByExampleSelective(@Param("record") Holiday record, @Param("example") HolidayExample example);

    int updateByExample(@Param("record") Holiday record, @Param("example") HolidayExample example);

    int updateByPrimaryKeySelective(Holiday record);

    int updateByPrimaryKey(Holiday record);
}