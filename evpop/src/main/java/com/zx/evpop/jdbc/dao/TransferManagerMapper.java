package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.TransferManager;
import com.zx.evpop.jdbc.entity.TransferManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferManagerMapper {
    int countByExample(TransferManagerExample example);

    int deleteByPrimaryKey(Long tbtmId);

    int insert(TransferManager record);

    int insertSelective(TransferManager record);

    List<TransferManager> selectByExampleWithBLOBs(TransferManagerExample example);

    List<TransferManager> selectByExample(TransferManagerExample example);

    TransferManager selectByPrimaryKey(Long tbtmId);

    int updateByExampleSelective(@Param("record") TransferManager record, @Param("example") TransferManagerExample example);

    int updateByExampleWithBLOBs(@Param("record") TransferManager record, @Param("example") TransferManagerExample example);

    int updateByExample(@Param("record") TransferManager record, @Param("example") TransferManagerExample example);

    int updateByPrimaryKeySelective(TransferManager record);

    int updateByPrimaryKeyWithBLOBs(TransferManager record);

    int updateByPrimaryKey(TransferManager record);
}