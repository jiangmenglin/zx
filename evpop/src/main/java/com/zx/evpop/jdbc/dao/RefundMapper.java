package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Refund;
import com.zx.evpop.jdbc.entity.RefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundMapper {
    int countByExample(RefundExample example);

    int deleteByPrimaryKey(Integer tbrId);

    int insert(Refund record);

    int insertSelective(Refund record);

    List<Refund> selectByExample(RefundExample example);

    Refund selectByPrimaryKey(Integer tbrId);

    int updateByExampleSelective(@Param("record") Refund record, @Param("example") RefundExample example);

    int updateByExample(@Param("record") Refund record, @Param("example") RefundExample example);

    int updateByPrimaryKeySelective(Refund record);

    int updateByPrimaryKey(Refund record);
}