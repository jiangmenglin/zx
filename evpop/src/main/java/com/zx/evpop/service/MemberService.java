package com.zx.evpop.service;

import com.zx.evpop.jdbc.entity.Member;
import com.zx.evpop.util.PageBean;

import java.util.List;

public interface MemberService {
    Member findById(Integer id);

    PageBean<Member> findByNameLike(String name, int currentPage, int pageSize);

}
