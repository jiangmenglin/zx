package com.zx.evpop.service.impl;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zx.evpop.jdbc.dao.MemberMapper;
import com.zx.evpop.jdbc.entity.Member;
import com.zx.evpop.jdbc.entity.MemberExample;
import com.zx.evpop.service.MemberService;
import com.zx.evpop.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jiangmenglin.
 *
 * @author jiangmenglin
 * description:
 * date: 2018/10/30 11:37
 */
@Service
public class MemberServiceImpl implements MemberService {

    static Gson gson = new GsonBuilder().serializeNulls().create();

    @Autowired
    MemberMapper memberMapper;
    @Override
    public Member findById(Integer id) {
        return memberMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean<Member> findByNameLike(String name, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        MemberExample example = new MemberExample();
        example.createCriteria().andTbmNameLike("%" + name + "%");
        List<Member> allItems = memberMapper.selectByExample(example);
        int countNums = memberMapper.countByExample(example);
        PageBean<Member> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData;
    }


}
