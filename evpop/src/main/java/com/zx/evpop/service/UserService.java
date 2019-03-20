package com.zx.evpop.service;

import com.zx.evpop.jdbc.entity.Member;

public interface UserService {

    void sendLoginSms(String mobile);

    Member findByMobile(String mobile);

    void login(String mobile, String smsCode);
}
