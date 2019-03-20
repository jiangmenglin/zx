package com.zx.evpop.redis.dao;

import com.zx.evpop.redis.domain.TokenModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by jiangmenglin.
 *
 * @author jiangmenglin
 * description:
 * date: 2018/11/1 14:57
 */
@Component
public class TestDAO {
    @Autowired
    private RedisTemplate redisTemplate;


    public void set(String key, TokenModel model) {
        redisTemplate.opsForValue().set(key, model, 60l, TimeUnit.SECONDS);
    }

    public TokenModel get(String key) {
        return (TokenModel)redisTemplate.opsForValue().get(key);

    }

    public void remove(String key) {
        redisTemplate.delete(key);
    }
}
