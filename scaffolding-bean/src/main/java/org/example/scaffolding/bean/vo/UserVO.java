package org.example.scaffolding.bean.vo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
/**
 * 用户实体类
 */
public class UserVO {
    /**
     * 用户ID
     */
    private String id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 电子邮件
     */
    private String email;
}
