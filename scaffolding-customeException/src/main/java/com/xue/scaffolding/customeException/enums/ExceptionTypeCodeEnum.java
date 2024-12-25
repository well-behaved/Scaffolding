package com.xue.scaffolding.customeException.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionTypeCodeEnum {
    /**
     * 参数类异常编码前缀
     */
    CUSTOM_PARAM_CODE_ENUM("10000"),
    /**
     * 资源类异常编码前缀
     */
    CUSTOM_RESOURCE_CODE_ENUM("10001"),
    ;
    /**
     * 编码前缀
     */
    private final String code;


}
