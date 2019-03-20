package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.ContactUserRecords;
import com.zx.evpop.jdbc.entity.ContactUserRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactUserRecordsMapper {
    int countByExample(ContactUserRecordsExample example);

    int deleteByPrimaryKey(Long tbcurId);

    int insert(ContactUserRecords record);

    int insertSelective(ContactUserRecords record);

    List<ContactUserRecords> selectByExample(ContactUserRecordsExample example);

    ContactUserRecords selectByPrimaryKey(Long tbcurId);

    int updateByExampleSelective(@Param("record") ContactUserRecords record, @Param("example") ContactUserRecordsExample example);

    int updateByExample(@Param("record") ContactUserRecords record, @Param("example") ContactUserRecordsExample example);

    int updateByPrimaryKeySelective(ContactUserRecords record);

    int updateByPrimaryKey(ContactUserRecords record);
}