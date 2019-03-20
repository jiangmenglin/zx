package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Error;
import com.zx.evpop.jdbc.entity.ErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErrorMapper {
    int countByExample(ErrorExample example);

    int deleteByPrimaryKey(Long seId);

    int insert(Error record);

    int insertSelective(Error record);

    List<Error> selectByExampleWithBLOBs(ErrorExample example);

    List<Error> selectByExample(ErrorExample example);

    Error selectByPrimaryKey(Long seId);

    int updateByExampleSelective(@Param("record") Error record, @Param("example") ErrorExample example);

    int updateByExampleWithBLOBs(@Param("record") Error record, @Param("example") ErrorExample example);

    int updateByExample(@Param("record") Error record, @Param("example") ErrorExample example);

    int updateByPrimaryKeySelective(Error record);

    int updateByPrimaryKeyWithBLOBs(Error record);

    int updateByPrimaryKey(Error record);
}