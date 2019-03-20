package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.LongBespeak;
import com.zx.evpop.jdbc.entity.LongBespeakExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LongBespeakMapper {
    int countByExample(LongBespeakExample example);

    int deleteByPrimaryKey(Long tblbId);

    int insert(LongBespeak record);

    int insertSelective(LongBespeak record);

    List<LongBespeak> selectByExample(LongBespeakExample example);

    LongBespeak selectByPrimaryKey(Long tblbId);

    int updateByExampleSelective(@Param("record") LongBespeak record, @Param("example") LongBespeakExample example);

    int updateByExample(@Param("record") LongBespeak record, @Param("example") LongBespeakExample example);

    int updateByPrimaryKeySelective(LongBespeak record);

    int updateByPrimaryKey(LongBespeak record);
}