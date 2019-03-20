package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.ThirdAccount;
import com.zx.evpop.jdbc.entity.ThirdAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThirdAccountMapper {
    int countByExample(ThirdAccountExample example);

    int deleteByPrimaryKey(Integer tbtaId);

    int insert(ThirdAccount record);

    int insertSelective(ThirdAccount record);

    List<ThirdAccount> selectByExample(ThirdAccountExample example);

    ThirdAccount selectByPrimaryKey(Integer tbtaId);

    int updateByExampleSelective(@Param("record") ThirdAccount record, @Param("example") ThirdAccountExample example);

    int updateByExample(@Param("record") ThirdAccount record, @Param("example") ThirdAccountExample example);

    int updateByPrimaryKeySelective(ThirdAccount record);

    int updateByPrimaryKey(ThirdAccount record);
}