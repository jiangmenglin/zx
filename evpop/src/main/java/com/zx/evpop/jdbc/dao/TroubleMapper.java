package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Trouble;
import com.zx.evpop.jdbc.entity.TroubleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TroubleMapper {
    int countByExample(TroubleExample example);

    int deleteByPrimaryKey(Long tbtId);

    int insert(Trouble record);

    int insertSelective(Trouble record);

    List<Trouble> selectByExampleWithBLOBs(TroubleExample example);

    List<Trouble> selectByExample(TroubleExample example);

    Trouble selectByPrimaryKey(Long tbtId);

    int updateByExampleSelective(@Param("record") Trouble record, @Param("example") TroubleExample example);

    int updateByExampleWithBLOBs(@Param("record") Trouble record, @Param("example") TroubleExample example);

    int updateByExample(@Param("record") Trouble record, @Param("example") TroubleExample example);

    int updateByPrimaryKeySelective(Trouble record);

    int updateByPrimaryKeyWithBLOBs(Trouble record);

    int updateByPrimaryKey(Trouble record);
}