package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Oauth;
import com.zx.evpop.jdbc.entity.OauthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthMapper {
    int countByExample(OauthExample example);

    int deleteByPrimaryKey(Long soId);

    int insert(Oauth record);

    int insertSelective(Oauth record);

    List<Oauth> selectByExample(OauthExample example);

    Oauth selectByPrimaryKey(Long soId);

    int updateByExampleSelective(@Param("record") Oauth record, @Param("example") OauthExample example);

    int updateByExample(@Param("record") Oauth record, @Param("example") OauthExample example);

    int updateByPrimaryKeySelective(Oauth record);

    int updateByPrimaryKey(Oauth record);
}