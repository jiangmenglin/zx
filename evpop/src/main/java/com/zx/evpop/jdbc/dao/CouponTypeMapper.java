package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.CouponType;
import com.zx.evpop.jdbc.entity.CouponTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponTypeMapper {
    int countByExample(CouponTypeExample example);

    int deleteByPrimaryKey(Integer tbctId);

    int insert(CouponType record);

    int insertSelective(CouponType record);

    List<CouponType> selectByExample(CouponTypeExample example);

    CouponType selectByPrimaryKey(Integer tbctId);

    int updateByExampleSelective(@Param("record") CouponType record, @Param("example") CouponTypeExample example);

    int updateByExample(@Param("record") CouponType record, @Param("example") CouponTypeExample example);

    int updateByPrimaryKeySelective(CouponType record);

    int updateByPrimaryKey(CouponType record);
}