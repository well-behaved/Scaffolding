package com.xue.scaffolding.demo1.service.impl;

import com.xue.scaffolding.demo1.mapper.UserMapper;
import com.xue.scaffolding.demo1.service.UserService;
import org.example.scaffolding.bean.bo.UserBO;
import org.example.scaffolding.bean.vo.UserVO;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserVO getUserById(String id) {
        // 模拟获取用户信息
        UserBO user = new UserBO();
        user.setId(id);
        user.setUsername("testuser");
        user.setPassword("testpassword");
        user.setEmail("test@example.com");
        return UserMapper.INSTANCE.toUserVO(user);
    }
}
