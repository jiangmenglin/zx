package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Price;
import com.zx.evpop.jdbc.entity.PriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriceMapper {
    int countByExample(PriceExample example);

    int deleteByPrimaryKey(Long tbpId);

    int insert(Price record);

    int insertSelective(Price record);

    List<Price> selectByExample(PriceExample example);

    Price selectByPrimaryKey(Long tbpId);

    int updateByExampleSelective(@Param("record") Price record, @Param("example") PriceExample example);

    int updateByExample(@Param("record") Price record, @Param("example") PriceExample example);

    int updateByPrimaryKeySelective(Price record);

    int updateByPrimaryKey(Price record);
}