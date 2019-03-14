package com.czxy.shop.auth.controller;

import com.czxy.shop.auth.service.AuthService;
import com.czxy.shop.pojo.User;
import com.czxy.shop.vo.BaseResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Pupupupupu on 2019/2/28.
 */
@RestController
@RequestMapping
public class AuthController {

    @Resource
    private AuthService authService;

    /**
     *  http://localhost:10010/v1/auth-service/login
     *  登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    public ResponseEntity<BaseResult> login(@RequestBody User user){
        //获得token
        String token = authService.login(user.getMobile(),user.getPassword());
        System.out.println(token);
        //如果有token 返回
        if(StringUtils.isNotBlank(token)){
            BaseResult baseResult = new BaseResult(0,"登录成功").append("token",token);
            return ResponseEntity.ok(baseResult);
        }
        //如果没有token  就是失败
        return ResponseEntity.ok(new BaseResult(1,"登录失败"));
    }
}
