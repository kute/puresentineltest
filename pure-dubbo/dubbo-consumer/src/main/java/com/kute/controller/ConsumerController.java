package com.kute.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kute.service.api.IUserService;
import com.kute.service.domain.UserData;
import org.springframework.web.bind.annotation.*;

/**
 * created by bailong001 on 2018/10/06 19:22
 */
@RestController
@RequestMapping("/rest")
public class ConsumerController {

    @Reference
    private IUserService userService;

    @GetMapping("/get/{id}")
    public UserData getUserData(@PathVariable(required = false) Long id) {
        return userService.getUserData(id);
    }

}
