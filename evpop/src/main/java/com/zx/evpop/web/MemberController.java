package com.zx.evpop.web;

import com.github.pagehelper.PageHelper;
import com.zx.evpop.jdbc.entity.Member;
import com.zx.evpop.service.MemberService;
import com.zx.evpop.util.PageBean;
import com.zx.evpop.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jiangmenglin.
 *
 * @author jiangmenglin
 * description:
 * date: 2018/10/30 11:38
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Member findById(@PathVariable Integer id) {
        return memberService.findById(id);
    }

    @RequestMapping(value = "/findByNameLike/{currentPage}/{pageSize}/{name}", method = RequestMethod.GET)
    @ResponseBody
    public ResultVo<PageBean<Member>> findByNameLike(@PathVariable(value = "currentPage") int currentPage, @PathVariable(value = "pageSize") int pageSize, @PathVariable(value = "name") String name) {
        System.out.println(name);
        PageBean<Member> pageData = memberService.findByNameLike(name, currentPage, pageSize);
        return new ResultVo<>(pageData);
    }


}
