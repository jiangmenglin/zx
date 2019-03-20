package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.LongOrderDetail;
import com.zx.evpop.jdbc.entity.LongOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LongOrderDetailMapper {
    int countByExample(LongOrderDetailExample example);

    int deleteByPrimaryKey(Long tblodId);

    int insert(LongOrderDetail record);

    int insertSelective(LongOrderDetail record);

    List<LongOrderDetail> selectByExample(LongOrderDetailExample example);

    LongOrderDetail selectByPrimaryKey(Long tblodId);

    int updateByExampleSelective(@Param("record") LongOrderDetail record, @Param("example") LongOrderDetailExample example);

    int updateByExample(@Param("record") LongOrderDetail record, @Param("example") LongOrderDetailExample example);

    int updateByPrimaryKeySelective(LongOrderDetail record);

    int updateByPrimaryKey(LongOrderDetail record);
}