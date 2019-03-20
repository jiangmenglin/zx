package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.BankType;
import com.zx.evpop.jdbc.entity.BankTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankTypeMapper {
    int countByExample(BankTypeExample example);

    int deleteByPrimaryKey(Long tbbtId);

    int insert(BankType record);

    int insertSelective(BankType record);

    List<BankType> selectByExample(BankTypeExample example);

    BankType selectByPrimaryKey(Long tbbtId);

    int updateByExampleSelective(@Param("record") BankType record, @Param("example") BankTypeExample example);

    int updateByExample(@Param("record") BankType record, @Param("example") BankTypeExample example);

    int updateByPrimaryKeySelective(BankType record);

    int updateByPrimaryKey(BankType record);
}