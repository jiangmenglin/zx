package com.zx.evpop.util;

/**
 * Created by jiangmenglin.
 *
 * @author jiangmenglin
 * description:
 * date: 2018/11/1 9:07
 */
public class CodeUtil {

    //产生n位验证码
    public static String generateNumberCode(int len) {
        String res = "";
        int num;
        for (int i = 0; i < len;i++) {
            num = (int)((Math.random()) * 10);
            res += num;
        }
        return res;
    }
}
