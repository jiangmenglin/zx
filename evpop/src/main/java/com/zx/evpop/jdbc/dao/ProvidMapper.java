package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Provid;
import com.zx.evpop.jdbc.entity.ProvidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvidMapper {
    int countByExample(ProvidExample example);

    int deleteByPrimaryKey(Long tbpId);

    int insert(Provid record);

    int insertSelective(Provid record);

    List<Provid> selectByExample(ProvidExample example);

    Provid selectByPrimaryKey(Long tbpId);

    int updateByExampleSelective(@Param("record") Provid record, @Param("example") ProvidExample example);

    int updateByExample(@Param("record") Provid record, @Param("example") ProvidExample example);

    int updateByPrimaryKeySelective(Provid record);

    int updateByPrimaryKey(Provid record);
}