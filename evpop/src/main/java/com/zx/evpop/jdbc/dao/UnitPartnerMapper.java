package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.UnitPartner;
import com.zx.evpop.jdbc.entity.UnitPartnerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitPartnerMapper {
    int countByExample(UnitPartnerExample example);

    int deleteByPrimaryKey(Long tbupId);

    int insert(UnitPartner record);

    int insertSelective(UnitPartner record);

    List<UnitPartner> selectByExample(UnitPartnerExample example);

    UnitPartner selectByPrimaryKey(Long tbupId);

    int updateByExampleSelective(@Param("record") UnitPartner record, @Param("example") UnitPartnerExample example);

    int updateByExample(@Param("record") UnitPartner record, @Param("example") UnitPartnerExample example);

    int updateByPrimaryKeySelective(UnitPartner record);

    int updateByPrimaryKey(UnitPartner record);
}