package com.xue.scaffolding.demo1.service;

import org.example.scaffolding.bean.vo.UserVO;

public interface UserService {
    /**
     * 根据用户ID获取用户信息
     *
     * @param id 用户ID
     * @return 用户信息
     */
    UserVO getUserById(String id);
}
