package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.SmsTemplate;
import com.zx.evpop.jdbc.entity.SmsTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsTemplateMapper {
    int countByExample(SmsTemplateExample example);

    int deleteByPrimaryKey(Integer tbstId);

    int insert(SmsTemplate record);

    int insertSelective(SmsTemplate record);

    List<SmsTemplate> selectByExample(SmsTemplateExample example);

    SmsTemplate selectByPrimaryKey(Integer tbstId);

    int updateByExampleSelective(@Param("record") SmsTemplate record, @Param("example") SmsTemplateExample example);

    int updateByExample(@Param("record") SmsTemplate record, @Param("example") SmsTemplateExample example);

    int updateByPrimaryKeySelective(SmsTemplate record);

    int updateByPrimaryKey(SmsTemplate record);
}