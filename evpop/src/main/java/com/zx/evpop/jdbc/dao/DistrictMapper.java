package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.District;
import com.zx.evpop.jdbc.entity.DistrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistrictMapper {
    int countByExample(DistrictExample example);

    int deleteByPrimaryKey(Long tbdId);

    int insert(District record);

    int insertSelective(District record);

    List<District> selectByExampleWithBLOBs(DistrictExample example);

    List<District> selectByExample(DistrictExample example);

    District selectByPrimaryKey(Long tbdId);

    int updateByExampleSelective(@Param("record") District record, @Param("example") DistrictExample example);

    int updateByExampleWithBLOBs(@Param("record") District record, @Param("example") DistrictExample example);

    int updateByExample(@Param("record") District record, @Param("example") DistrictExample example);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKeyWithBLOBs(District record);

    int updateByPrimaryKey(District record);
}