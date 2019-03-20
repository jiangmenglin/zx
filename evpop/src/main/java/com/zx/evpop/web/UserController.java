package com.zx.evpop.web;

import com.zx.evpop.jdbc.entity.Member;
import com.zx.evpop.service.UserService;
import com.zx.evpop.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangmenglin.
 *
 * @author jiangmenglin
 * description:
 * date: 2018/11/1 8:53
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/sendLoginSms/{mobile}", method = RequestMethod.GET)
    public ResultVo sendLoginSms(@PathVariable String mobile) {
        userService.sendLoginSms(mobile);
        return new ResultVo();
    }

    @RequestMapping(value = "/findByMobile/{mobile}", method = RequestMethod.GET)
    public ResultVo<Member> findByMobile(@PathVariable String mobile) {
        Member member = userService.findByMobile(mobile);
        return new ResultVo<Member>(member);
    }

    @RequestMapping(value = "/login/{mobile}/{smsCode}", method = RequestMethod.GET)
    public ResultVo login(@PathVariable("mobile") String mobile, @PathVariable("smsCode") String smsCode) {
        userService.login( mobile,  smsCode);
        return new ResultVo();
    }
}
