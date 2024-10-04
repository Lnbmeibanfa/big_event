package com.itheima.big_event.controller;


import com.itheima.big_event.pojo.Result;
import com.itheima.big_event.pojo.User;
import com.itheima.big_event.service.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @GetMapping("/register")
    public Result register(@RequestParam String username, @RequestParam String password) {
        log.info("username: {}, password: {}", username, password);
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        registerService.insertUser(user);
        return Result.success();
    }
}
