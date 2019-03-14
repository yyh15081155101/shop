package com.czxy.shop.auth.client;

import com.czxy.shop.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Pupupupupu on 2019/2/28.
 */
@FeignClient(value = "web-service")
public interface UserClient {
    @GetMapping("/query")
    public ResponseEntity<User> queryUser(@RequestParam("mobile") String mobile, @RequestParam("password") String password);
}

