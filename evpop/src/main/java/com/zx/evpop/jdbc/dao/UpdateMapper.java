package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Update;
import com.zx.evpop.jdbc.entity.UpdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpdateMapper {
    int countByExample(UpdateExample example);

    int deleteByPrimaryKey(Integer tbuId);

    int insert(Update record);

    int insertSelective(Update record);

    List<Update> selectByExample(UpdateExample example);

    Update selectByPrimaryKey(Integer tbuId);

    int updateByExampleSelective(@Param("record") Update record, @Param("example") UpdateExample example);

    int updateByExample(@Param("record") Update record, @Param("example") UpdateExample example);

    int updateByPrimaryKeySelective(Update record);

    int updateByPrimaryKey(Update record);
}