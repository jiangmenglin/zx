package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.ViolatQuery;
import com.zx.evpop.jdbc.entity.ViolatQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolatQueryMapper {
    int countByExample(ViolatQueryExample example);

    int deleteByPrimaryKey(Long tbvqId);

    int insert(ViolatQuery record);

    int insertSelective(ViolatQuery record);

    List<ViolatQuery> selectByExampleWithBLOBs(ViolatQueryExample example);

    List<ViolatQuery> selectByExample(ViolatQueryExample example);

    ViolatQuery selectByPrimaryKey(Long tbvqId);

    int updateByExampleSelective(@Param("record") ViolatQuery record, @Param("example") ViolatQueryExample example);

    int updateByExampleWithBLOBs(@Param("record") ViolatQuery record, @Param("example") ViolatQueryExample example);

    int updateByExample(@Param("record") ViolatQuery record, @Param("example") ViolatQueryExample example);

    int updateByPrimaryKeySelective(ViolatQuery record);

    int updateByPrimaryKeyWithBLOBs(ViolatQuery record);

    int updateByPrimaryKey(ViolatQuery record);
}