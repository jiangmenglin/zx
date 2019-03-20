package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.ApiClient;
import com.zx.evpop.jdbc.entity.ApiClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiClientMapper {
    int countByExample(ApiClientExample example);

    int deleteByPrimaryKey(Long sacId);

    int insert(ApiClient record);

    int insertSelective(ApiClient record);

    List<ApiClient> selectByExample(ApiClientExample example);

    ApiClient selectByPrimaryKey(Long sacId);

    int updateByExampleSelective(@Param("record") ApiClient record, @Param("example") ApiClientExample example);

    int updateByExample(@Param("record") ApiClient record, @Param("example") ApiClientExample example);

    int updateByPrimaryKeySelective(ApiClient record);

    int updateByPrimaryKey(ApiClient record);
}