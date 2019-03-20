package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Lprice;
import com.zx.evpop.jdbc.entity.LpriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LpriceMapper {
    int countByExample(LpriceExample example);

    int deleteByPrimaryKey(Long tblId);

    int insert(Lprice record);

    int insertSelective(Lprice record);

    List<Lprice> selectByExample(LpriceExample example);

    Lprice selectByPrimaryKey(Long tblId);

    int updateByExampleSelective(@Param("record") Lprice record, @Param("example") LpriceExample example);

    int updateByExample(@Param("record") Lprice record, @Param("example") LpriceExample example);

    int updateByPrimaryKeySelective(Lprice record);

    int updateByPrimaryKey(Lprice record);
}