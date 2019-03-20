package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.LfeeType;
import com.zx.evpop.jdbc.entity.LfeeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LfeeTypeMapper {
    int countByExample(LfeeTypeExample example);

    int deleteByPrimaryKey(Long tbltId);

    int insert(LfeeType record);

    int insertSelective(LfeeType record);

    List<LfeeType> selectByExample(LfeeTypeExample example);

    LfeeType selectByPrimaryKey(Long tbltId);

    int updateByExampleSelective(@Param("record") LfeeType record, @Param("example") LfeeTypeExample example);

    int updateByExample(@Param("record") LfeeType record, @Param("example") LfeeTypeExample example);

    int updateByPrimaryKeySelective(LfeeType record);

    int updateByPrimaryKey(LfeeType record);
}