package com.czxy.shop.auth.service;

import com.czxy.shop.auth.client.UserClient;
import com.czxy.shop.auth.config.JwtProperties;
import com.czxy.shop.auth.entity.UserInfo;
import com.czxy.shop.auth.util.JwtUtils;
import com.czxy.shop.pojo.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Pupupupupu on 2019/2/28.
 */
@Service
@EnableConfigurationProperties(JwtProperties.class)
public class AuthService {

    @Resource
    private JwtProperties jwtProperties;

    @Resource
    private UserClient userClient;


    public String login(String mobile, String password) {
        try {
            //1查询用户信息
            User user = userClient.queryUser(mobile,password).getBody();
            //生成token
            if(user != null){
                return JwtUtils.generateToken(new UserInfo(user.getId(),user.getMobile()),jwtProperties.getPrivateKey(),jwtProperties.getExpire());
            }
            //如果为空
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //说明没有登录成功
        return null;
    }
}
