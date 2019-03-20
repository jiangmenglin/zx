package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Property;
import com.zx.evpop.jdbc.entity.PropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropertyMapper {
    int countByExample(PropertyExample example);

    int deleteByPrimaryKey(Long spId);

    int insert(Property record);

    int insertSelective(Property record);

    List<Property> selectByExampleWithBLOBs(PropertyExample example);

    List<Property> selectByExample(PropertyExample example);

    Property selectByPrimaryKey(Long spId);

    int updateByExampleSelective(@Param("record") Property record, @Param("example") PropertyExample example);

    int updateByExampleWithBLOBs(@Param("record") Property record, @Param("example") PropertyExample example);

    int updateByExample(@Param("record") Property record, @Param("example") PropertyExample example);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKeyWithBLOBs(Property record);

    int updateByPrimaryKey(Property record);
}