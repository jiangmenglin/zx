package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Outlets;
import com.zx.evpop.jdbc.entity.OutletsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutletsMapper {
    int countByExample(OutletsExample example);

    int deleteByPrimaryKey(Integer tboId);

    int insert(Outlets record);

    int insertSelective(Outlets record);

    List<Outlets> selectByExample(OutletsExample example);

    Outlets selectByPrimaryKey(Integer tboId);

    int updateByExampleSelective(@Param("record") Outlets record, @Param("example") OutletsExample example);

    int updateByExample(@Param("record") Outlets record, @Param("example") OutletsExample example);

    int updateByPrimaryKeySelective(Outlets record);

    int updateByPrimaryKey(Outlets record);
}