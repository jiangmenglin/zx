package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Api;
import com.zx.evpop.jdbc.entity.ApiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiMapper {
    int countByExample(ApiExample example);

    int deleteByPrimaryKey(Long saId);

    int insert(Api record);

    int insertSelective(Api record);

    List<Api> selectByExample(ApiExample example);

    Api selectByPrimaryKey(Long saId);

    int updateByExampleSelective(@Param("record") Api record, @Param("example") ApiExample example);

    int updateByExample(@Param("record") Api record, @Param("example") ApiExample example);

    int updateByPrimaryKeySelective(Api record);

    int updateByPrimaryKey(Api record);
}