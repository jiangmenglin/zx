package com.zx.evpop.service.impl;

import com.zx.evpop.jdbc.dao.MemberMapper;
import com.zx.evpop.jdbc.entity.Member;
import com.zx.evpop.jdbc.entity.MemberExample;
import com.zx.evpop.redis.dao.TestDAO;
import com.zx.evpop.redis.domain.TokenModel;
import com.zx.evpop.service.UserService;
import com.zx.evpop.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jiangmenglin.
 *
 * @author jiangmenglin
 * description:
 * date: 2018/11/1 8:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private TestDAO testDAO;

    @Override
    public void sendLoginSms(String mobile) {
        String smsCode = CodeUtil.generateNumberCode(6);
        TokenModel tokenModel = new TokenModel(mobile, smsCode);
        testDAO.set(mobile, tokenModel);
        System.out.println("发送短信验证码：" + smsCode);
    }

    @Override
    public Member findByMobile(String mobile) {
        MemberExample example = new MemberExample();
        example.createCriteria().andTbmMobileEqualTo(mobile);
        example.createCriteria().andTbmStatusEqualTo((byte)1);
        List<Member> members = memberMapper.selectByExample(example);
        if (members == null || members.isEmpty()) {
            return null;
        } else if (members.size() > 1) {
            //抛出异常
        }
        return members.get(0);
    }

    @Override
    public void login(String mobile, String smsCode) {
        TokenModel toeknModel = testDAO.get(mobile);
        if (smsCode.equals(toeknModel.getToken())) {
            testDAO.remove(mobile);
            System.out.println("login successfully");
        } else {
            System.out.println("login faile");
        }
    }
}
