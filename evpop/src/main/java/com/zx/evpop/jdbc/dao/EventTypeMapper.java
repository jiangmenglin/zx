package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.EventType;
import com.zx.evpop.jdbc.entity.EventTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventTypeMapper {
    int countByExample(EventTypeExample example);

    int deleteByPrimaryKey(Integer tbetId);

    int insert(EventType record);

    int insertSelective(EventType record);

    List<EventType> selectByExample(EventTypeExample example);

    EventType selectByPrimaryKey(Integer tbetId);

    int updateByExampleSelective(@Param("record") EventType record, @Param("example") EventTypeExample example);

    int updateByExample(@Param("record") EventType record, @Param("example") EventTypeExample example);

    int updateByPrimaryKeySelective(EventType record);

    int updateByPrimaryKey(EventType record);
}