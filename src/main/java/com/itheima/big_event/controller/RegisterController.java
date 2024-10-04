package com.itheima.big_event.controller;


import com.itheima.big_event.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class RegisterController {

    @GetMapping("/register")
    public Result register() {
        log.info("Register");
        return Result.success();
    }
}
