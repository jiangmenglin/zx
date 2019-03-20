package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.ApiType;
import com.zx.evpop.jdbc.entity.ApiTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiTypeMapper {
    int countByExample(ApiTypeExample example);

    int deleteByPrimaryKey(Long satId);

    int insert(ApiType record);

    int insertSelective(ApiType record);

    List<ApiType> selectByExample(ApiTypeExample example);

    ApiType selectByPrimaryKey(Long satId);

    int updateByExampleSelective(@Param("record") ApiType record, @Param("example") ApiTypeExample example);

    int updateByExample(@Param("record") ApiType record, @Param("example") ApiTypeExample example);

    int updateByPrimaryKeySelective(ApiType record);

    int updateByPrimaryKey(ApiType record);
}