package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.UpgradeLog;
import com.zx.evpop.jdbc.entity.UpgradeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpgradeLogMapper {
    int countByExample(UpgradeLogExample example);

    int deleteByPrimaryKey(Integer tbulId);

    int insert(UpgradeLog record);

    int insertSelective(UpgradeLog record);

    List<UpgradeLog> selectByExample(UpgradeLogExample example);

    UpgradeLog selectByPrimaryKey(Integer tbulId);

    int updateByExampleSelective(@Param("record") UpgradeLog record, @Param("example") UpgradeLogExample example);

    int updateByExample(@Param("record") UpgradeLog record, @Param("example") UpgradeLogExample example);

    int updateByPrimaryKeySelective(UpgradeLog record);

    int updateByPrimaryKey(UpgradeLog record);
}