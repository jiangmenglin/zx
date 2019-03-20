package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.CouponCode;
import com.zx.evpop.jdbc.entity.CouponCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponCodeMapper {
    int countByExample(CouponCodeExample example);

    int deleteByPrimaryKey(Integer tbccId);

    int insert(CouponCode record);

    int insertSelective(CouponCode record);

    List<CouponCode> selectByExample(CouponCodeExample example);

    CouponCode selectByPrimaryKey(Integer tbccId);

    int updateByExampleSelective(@Param("record") CouponCode record, @Param("example") CouponCodeExample example);

    int updateByExample(@Param("record") CouponCode record, @Param("example") CouponCodeExample example);

    int updateByPrimaryKeySelective(CouponCode record);

    int updateByPrimaryKey(CouponCode record);
}