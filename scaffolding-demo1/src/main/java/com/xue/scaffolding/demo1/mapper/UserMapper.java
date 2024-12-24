package com.xue.scaffolding.demo1.mapper;

import org.example.scaffolding.bean.bo.UserBO;
import org.example.scaffolding.bean.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 用户VO到BO的映射器
 */
@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    /**
     * 将用户VO转换为用户BO
     *
     * @param userVO 用户VO
     * @return 用户BO
     */
    UserBO toUserBO(UserVO userVO);

    UserVO toUserVO(UserBO user);
}
