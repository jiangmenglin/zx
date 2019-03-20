package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.UserFeedback;
import com.zx.evpop.jdbc.entity.UserFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFeedbackMapper {
    int countByExample(UserFeedbackExample example);

    int deleteByPrimaryKey(Long tbufId);

    int insert(UserFeedback record);

    int insertSelective(UserFeedback record);

    List<UserFeedback> selectByExample(UserFeedbackExample example);

    UserFeedback selectByPrimaryKey(Long tbufId);

    int updateByExampleSelective(@Param("record") UserFeedback record, @Param("example") UserFeedbackExample example);

    int updateByExample(@Param("record") UserFeedback record, @Param("example") UserFeedbackExample example);

    int updateByPrimaryKeySelective(UserFeedback record);

    int updateByPrimaryKey(UserFeedback record);
}