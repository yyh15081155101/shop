package com.czxy.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Created by Pupupupupu on 2018/12/13.
 */
@Configuration
public class RedisConfig {
    @Bean
    public StringRedisTemplate redisTemplate(RedisConnectionFactory connectionFactory){
        StringRedisTemplate srt = new StringRedisTemplate();
        srt.setConnectionFactory(connectionFactory);
        return srt;
    }
}
