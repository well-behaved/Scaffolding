package com.xue.scaffolding.customeException.controller;

import com.xue.scaffolding.customeException.bean.detail.CustomParamException;
import org.example.scaffolding.bean.result.CommonResult;
import org.example.scaffolding.bean.vo.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// 当前类中的所有方法都加入了 @ResponseBody，使用这个注解将返回的资源数据制成JSON格式响应给客户端。
@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public CommonResult<UserVO> getUserById(@PathVariable(value = "id") String id) throws Exception {
        throw new CustomParamException.EmptyExecution("测试业务异常");
    }

    @GetMapping("/users2/{id}")
    public CommonResult<UserVO> getUserById2(@PathVariable(value = "id") String id) throws Exception {
        throw new Exception("测试普通异常");
    }
}
