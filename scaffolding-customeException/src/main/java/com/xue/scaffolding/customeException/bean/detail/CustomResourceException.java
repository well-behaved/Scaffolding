package com.xue.scaffolding.customeException.bean.detail;

import com.xue.scaffolding.customeException.bean.CustomBaseException;
import com.xue.scaffolding.customeException.enums.ExceptionTypeCodeEnum;

import java.io.Serial;

/**
 * 资源类 自定义异常
 */
public class CustomResourceException {
    private static final String baseCode
            = ExceptionTypeCodeEnum.CUSTOM_RESOURCE_CODE_ENUM.getCode();
    /**
     * 通用资源异常
     */
    public static class ResourceCommonException  extends CustomBaseException {
        @Serial
        private static final long serialVersionUID = 3555714415375055302L;
        private static final String errorCode = "0";
        private static final String errorMsg = "请求资源异常";

        public ResourceCommonException() {
            super(baseCode + errorCode, errorMsg);
        }

        public ResourceCommonException(String message) {
            super(baseCode + errorCode, message);
        }
    }
    /**
     * 请求资源不存在
     */
    public static class ResourceNotFoundException  extends CustomBaseException {
        @Serial
        private static final long serialVersionUID = 3555714415375055302L;
        private static final String errorCode = "1";
        private static final String errorMsg = "请求资源不存在";

        public ResourceNotFoundException() {
            super(baseCode + errorCode, errorMsg);
        }

        public ResourceNotFoundException(String message) {
            super(baseCode + errorCode, message);
        }
    }

    /**
     * 请求资源不允许访问操作
     */
    public static class ResourceNotAllowException  extends CustomBaseException {
        @Serial
        private static final long serialVersionUID = 3555714415375055302L;
        private static final String errorCode = "2";
        private static final String errorMsg = "请求资源不允许访问操作";

        public ResourceNotAllowException() {
            super(baseCode + errorCode, errorMsg);
        }

        public ResourceNotAllowException(String message) {
            super(baseCode + errorCode, message);
        }
    }

}
