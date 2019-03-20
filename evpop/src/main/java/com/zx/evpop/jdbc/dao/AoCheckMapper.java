package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.AoCheck;
import com.zx.evpop.jdbc.entity.AoCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AoCheckMapper {
    int countByExample(AoCheckExample example);

    int deleteByPrimaryKey(Integer tbacId);

    int insert(AoCheck record);

    int insertSelective(AoCheck record);

    List<AoCheck> selectByExample(AoCheckExample example);

    AoCheck selectByPrimaryKey(Integer tbacId);

    int updateByExampleSelective(@Param("record") AoCheck record, @Param("example") AoCheckExample example);

    int updateByExample(@Param("record") AoCheck record, @Param("example") AoCheckExample example);

    int updateByPrimaryKeySelective(AoCheck record);

    int updateByPrimaryKey(AoCheck record);
}