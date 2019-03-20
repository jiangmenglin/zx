package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.PayRefund;
import com.zx.evpop.jdbc.entity.PayRefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayRefundMapper {
    int countByExample(PayRefundExample example);

    int deleteByPrimaryKey(Long tbprId);

    int insert(PayRefund record);

    int insertSelective(PayRefund record);

    List<PayRefund> selectByExample(PayRefundExample example);

    PayRefund selectByPrimaryKey(Long tbprId);

    int updateByExampleSelective(@Param("record") PayRefund record, @Param("example") PayRefundExample example);

    int updateByExample(@Param("record") PayRefund record, @Param("example") PayRefundExample example);

    int updateByPrimaryKeySelective(PayRefund record);

    int updateByPrimaryKey(PayRefund record);
}