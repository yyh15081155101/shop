package com.czxy.shop.controller;

import com.czxy.shop.pojo.User;
import com.czxy.shop.service.UserService;
import com.czxy.shop.vo.BaseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by Pupupupupu on 2019/2/28.
 */
@RestController
@RequestMapping
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 注册
     * @param user
     * @return
     */
    @PostMapping("/regist")
    public ResponseEntity<Object> regist(@RequestBody User user){
        try {
            userService.saveUser(user);
            return ResponseEntity.ok(new BaseResult(0,"注册成功"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new BaseResult(1,"注册失败"));
        }
    }

    /**
     * 根据电话和密码插叙
     * @param mobile
     * @param password
     * @return
     */
    @GetMapping("/query")
    public ResponseEntity<User> queryUser(@RequestParam("mobile") String mobile,@RequestParam("password") String password){
        //通过手机号查询User
        User user = userService.findByMobile(mobile);
        if(user == null || !user.getPassword().equals(password)){
            return ResponseEntity.ok(null);
        }
        //正确
        return ResponseEntity.ok(user);
    }

    @PostMapping("/updateP")
    public ResponseEntity<Object> updateP(@RequestBody User user){
        try {
            userService.updatePassword(user);
            return ResponseEntity.ok(new BaseResult(0,"注册成功"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new BaseResult(1,"注册失败"));
        }
    }



}
