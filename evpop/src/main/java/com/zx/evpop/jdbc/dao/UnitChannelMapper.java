package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.UnitChannel;
import com.zx.evpop.jdbc.entity.UnitChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitChannelMapper {
    int countByExample(UnitChannelExample example);

    int deleteByPrimaryKey(Long tbucId);

    int insert(UnitChannel record);

    int insertSelective(UnitChannel record);

    List<UnitChannel> selectByExample(UnitChannelExample example);

    UnitChannel selectByPrimaryKey(Long tbucId);

    int updateByExampleSelective(@Param("record") UnitChannel record, @Param("example") UnitChannelExample example);

    int updateByExample(@Param("record") UnitChannel record, @Param("example") UnitChannelExample example);

    int updateByPrimaryKeySelective(UnitChannel record);

    int updateByPrimaryKey(UnitChannel record);
}