package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.PayLog;
import com.zx.evpop.jdbc.entity.PayLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayLogMapper {
    int countByExample(PayLogExample example);

    int deleteByPrimaryKey(Long tbplId);

    int insert(PayLog record);

    int insertSelective(PayLog record);

    List<PayLog> selectByExampleWithBLOBs(PayLogExample example);

    List<PayLog> selectByExample(PayLogExample example);

    PayLog selectByPrimaryKey(Long tbplId);

    int updateByExampleSelective(@Param("record") PayLog record, @Param("example") PayLogExample example);

    int updateByExampleWithBLOBs(@Param("record") PayLog record, @Param("example") PayLogExample example);

    int updateByExample(@Param("record") PayLog record, @Param("example") PayLogExample example);

    int updateByPrimaryKeySelective(PayLog record);

    int updateByPrimaryKeyWithBLOBs(PayLog record);

    int updateByPrimaryKey(PayLog record);
}