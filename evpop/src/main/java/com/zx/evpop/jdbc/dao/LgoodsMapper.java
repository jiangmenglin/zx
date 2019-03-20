package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Lgoods;
import com.zx.evpop.jdbc.entity.LgoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LgoodsMapper {
    int countByExample(LgoodsExample example);

    int deleteByPrimaryKey(Long tblId);

    int insert(Lgoods record);

    int insertSelective(Lgoods record);

    List<Lgoods> selectByExample(LgoodsExample example);

    Lgoods selectByPrimaryKey(Long tblId);

    int updateByExampleSelective(@Param("record") Lgoods record, @Param("example") LgoodsExample example);

    int updateByExample(@Param("record") Lgoods record, @Param("example") LgoodsExample example);

    int updateByPrimaryKeySelective(Lgoods record);

    int updateByPrimaryKey(Lgoods record);
}