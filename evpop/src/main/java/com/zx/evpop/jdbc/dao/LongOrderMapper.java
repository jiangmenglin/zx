package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.LongOrder;
import com.zx.evpop.jdbc.entity.LongOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LongOrderMapper {
    int countByExample(LongOrderExample example);

    int deleteByPrimaryKey(Long tbloId);

    int insert(LongOrder record);

    int insertSelective(LongOrder record);

    List<LongOrder> selectByExample(LongOrderExample example);

    LongOrder selectByPrimaryKey(Long tbloId);

    int updateByExampleSelective(@Param("record") LongOrder record, @Param("example") LongOrderExample example);

    int updateByExample(@Param("record") LongOrder record, @Param("example") LongOrderExample example);

    int updateByPrimaryKeySelective(LongOrder record);

    int updateByPrimaryKey(LongOrder record);
}