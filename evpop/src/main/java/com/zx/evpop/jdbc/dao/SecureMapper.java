package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Secure;
import com.zx.evpop.jdbc.entity.SecureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecureMapper {
    int countByExample(SecureExample example);

    int deleteByPrimaryKey(Integer tbsId);

    int insert(Secure record);

    int insertSelective(Secure record);

    List<Secure> selectByExample(SecureExample example);

    Secure selectByPrimaryKey(Integer tbsId);

    int updateByExampleSelective(@Param("record") Secure record, @Param("example") SecureExample example);

    int updateByExample(@Param("record") Secure record, @Param("example") SecureExample example);

    int updateByPrimaryKeySelective(Secure record);

    int updateByPrimaryKey(Secure record);
}