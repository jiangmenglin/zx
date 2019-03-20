package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.WebHelp;
import com.zx.evpop.jdbc.entity.WebHelpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebHelpMapper {
    int countByExample(WebHelpExample example);

    int deleteByPrimaryKey(Long tbwhId);

    int insert(WebHelp record);

    int insertSelective(WebHelp record);

    List<WebHelp> selectByExampleWithBLOBs(WebHelpExample example);

    List<WebHelp> selectByExample(WebHelpExample example);

    WebHelp selectByPrimaryKey(Long tbwhId);

    int updateByExampleSelective(@Param("record") WebHelp record, @Param("example") WebHelpExample example);

    int updateByExampleWithBLOBs(@Param("record") WebHelp record, @Param("example") WebHelpExample example);

    int updateByExample(@Param("record") WebHelp record, @Param("example") WebHelpExample example);

    int updateByPrimaryKeySelective(WebHelp record);

    int updateByPrimaryKeyWithBLOBs(WebHelp record);

    int updateByPrimaryKey(WebHelp record);
}