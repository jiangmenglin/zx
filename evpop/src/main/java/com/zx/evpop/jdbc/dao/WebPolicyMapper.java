package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.WebPolicy;
import com.zx.evpop.jdbc.entity.WebPolicyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebPolicyMapper {
    int countByExample(WebPolicyExample example);

    int deleteByPrimaryKey(Long tbwpId);

    int insert(WebPolicy record);

    int insertSelective(WebPolicy record);

    List<WebPolicy> selectByExampleWithBLOBs(WebPolicyExample example);

    List<WebPolicy> selectByExample(WebPolicyExample example);

    WebPolicy selectByPrimaryKey(Long tbwpId);

    int updateByExampleSelective(@Param("record") WebPolicy record, @Param("example") WebPolicyExample example);

    int updateByExampleWithBLOBs(@Param("record") WebPolicy record, @Param("example") WebPolicyExample example);

    int updateByExample(@Param("record") WebPolicy record, @Param("example") WebPolicyExample example);

    int updateByPrimaryKeySelective(WebPolicy record);

    int updateByPrimaryKeyWithBLOBs(WebPolicy record);

    int updateByPrimaryKey(WebPolicy record);
}