package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Violat;
import com.zx.evpop.jdbc.entity.ViolatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolatMapper {
    int countByExample(ViolatExample example);

    int deleteByPrimaryKey(Integer tbvId);

    int insert(Violat record);

    int insertSelective(Violat record);

    List<Violat> selectByExample(ViolatExample example);

    Violat selectByPrimaryKey(Integer tbvId);

    int updateByExampleSelective(@Param("record") Violat record, @Param("example") ViolatExample example);

    int updateByExample(@Param("record") Violat record, @Param("example") ViolatExample example);

    int updateByPrimaryKeySelective(Violat record);

    int updateByPrimaryKey(Violat record);
}