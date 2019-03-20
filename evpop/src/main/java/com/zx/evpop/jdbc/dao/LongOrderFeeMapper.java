package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.LongOrderFee;
import com.zx.evpop.jdbc.entity.LongOrderFeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LongOrderFeeMapper {
    int countByExample(LongOrderFeeExample example);

    int deleteByPrimaryKey(Long tblofId);

    int insert(LongOrderFee record);

    int insertSelective(LongOrderFee record);

    List<LongOrderFee> selectByExample(LongOrderFeeExample example);

    LongOrderFee selectByPrimaryKey(Long tblofId);

    int updateByExampleSelective(@Param("record") LongOrderFee record, @Param("example") LongOrderFeeExample example);

    int updateByExample(@Param("record") LongOrderFee record, @Param("example") LongOrderFeeExample example);

    int updateByPrimaryKeySelective(LongOrderFee record);

    int updateByPrimaryKey(LongOrderFee record);
}