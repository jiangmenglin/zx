package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Voucher;
import com.zx.evpop.jdbc.entity.VoucherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoucherMapper {
    int countByExample(VoucherExample example);

    int deleteByPrimaryKey(Long tbvId);

    int insert(Voucher record);

    int insertSelective(Voucher record);

    List<Voucher> selectByExample(VoucherExample example);

    Voucher selectByPrimaryKey(Long tbvId);

    int updateByExampleSelective(@Param("record") Voucher record, @Param("example") VoucherExample example);

    int updateByExample(@Param("record") Voucher record, @Param("example") VoucherExample example);

    int updateByPrimaryKeySelective(Voucher record);

    int updateByPrimaryKey(Voucher record);
}