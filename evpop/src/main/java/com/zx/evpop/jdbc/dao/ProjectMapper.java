package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.Project;
import com.zx.evpop.jdbc.entity.ProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectMapper {
    int countByExample(ProjectExample example);

    int deleteByPrimaryKey(Long spId);

    int insert(Project record);

    int insertSelective(Project record);

    List<Project> selectByExampleWithBLOBs(ProjectExample example);

    List<Project> selectByExample(ProjectExample example);

    Project selectByPrimaryKey(Long spId);

    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExampleWithBLOBs(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKeyWithBLOBs(Project record);

    int updateByPrimaryKey(Project record);
}