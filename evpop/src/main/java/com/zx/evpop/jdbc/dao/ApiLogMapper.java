package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.ApiLog;
import com.zx.evpop.jdbc.entity.ApiLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiLogMapper {
    int countByExample(ApiLogExample example);

    int deleteByPrimaryKey(Long salId);

    int insert(ApiLog record);

    int insertSelective(ApiLog record);

    List<ApiLog> selectByExampleWithBLOBs(ApiLogExample example);

    List<ApiLog> selectByExample(ApiLogExample example);

    ApiLog selectByPrimaryKey(Long salId);

    int updateByExampleSelective(@Param("record") ApiLog record, @Param("example") ApiLogExample example);

    int updateByExampleWithBLOBs(@Param("record") ApiLog record, @Param("example") ApiLogExample example);

    int updateByExample(@Param("record") ApiLog record, @Param("example") ApiLogExample example);

    int updateByPrimaryKeySelective(ApiLog record);

    int updateByPrimaryKeyWithBLOBs(ApiLog record);

    int updateByPrimaryKey(ApiLog record);
}