package com.xue.scaffolding.demo1.controller;

import com.xue.scaffolding.demo1.service.UserService;
import org.example.scaffolding.bean.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// 当前类中的所有方法都加入了 @ResponseBody，使用这个注解将返回的资源数据制成JSON格式响应给客户端。
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public UserVO getUserById(@PathVariable(value = "id") String id) {
        return userService.getUserById(id);
    }
}
