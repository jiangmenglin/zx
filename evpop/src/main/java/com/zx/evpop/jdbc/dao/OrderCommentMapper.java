package com.zx.evpop.jdbc.dao;

import com.zx.evpop.jdbc.entity.OrderComment;
import com.zx.evpop.jdbc.entity.OrderCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCommentMapper {
    int countByExample(OrderCommentExample example);

    int deleteByPrimaryKey(Integer tbocId);

    int insert(OrderComment record);

    int insertSelective(OrderComment record);

    List<OrderComment> selectByExample(OrderCommentExample example);

    OrderComment selectByPrimaryKey(Integer tbocId);

    int updateByExampleSelective(@Param("record") OrderComment record, @Param("example") OrderCommentExample example);

    int updateByExample(@Param("record") OrderComment record, @Param("example") OrderCommentExample example);

    int updateByPrimaryKeySelective(OrderComment record);

    int updateByPrimaryKey(OrderComment record);
}