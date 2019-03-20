package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.WebNews;
import com.zx.evpop.jdbc.entity.WebNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebNewsMapper {
    int countByExample(WebNewsExample example);

    int deleteByPrimaryKey(Long tbwnId);

    int insert(WebNews record);

    int insertSelective(WebNews record);

    List<WebNews> selectByExampleWithBLOBs(WebNewsExample example);

    List<WebNews> selectByExample(WebNewsExample example);

    WebNews selectByPrimaryKey(Long tbwnId);

    int updateByExampleSelective(@Param("record") WebNews record, @Param("example") WebNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") WebNews record, @Param("example") WebNewsExample example);

    int updateByExample(@Param("record") WebNews record, @Param("example") WebNewsExample example);

    int updateByPrimaryKeySelective(WebNews record);

    int updateByPrimaryKeyWithBLOBs(WebNews record);

    int updateByPrimaryKey(WebNews record);
}