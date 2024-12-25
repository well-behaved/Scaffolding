package com.xue.scaffolding.customeException.bean.detail;

import com.xue.scaffolding.customeException.bean.CustomBaseException;
import com.xue.scaffolding.customeException.enums.ExceptionTypeCodeEnum;

import java.io.Serial;

/**
 * 参数类 自定义异常
 */
public class CustomParamException {
    private static final String baseCode
            = ExceptionTypeCodeEnum.CUSTOM_PARAM_CODE_ENUM.getCode();
    /**
     * 通用参数有误
     */
    public static class ParamCommonExecution extends CustomBaseException {
        @Serial
        private static final long serialVersionUID = 3555714415375055302L;
        private static final String errorCode = "0";
        private static final String errorMsg = "参数有误";

        public ParamCommonExecution() {
            super(baseCode + errorCode, errorMsg);
        }

        public ParamCommonExecution(String message) {
            super(baseCode + errorCode, message);
        }
    }
    /**
     * 参数格式错误
     */
    public static class FormatErrorExecution extends CustomBaseException {
        @Serial
        private static final long serialVersionUID = 3555714415375055302L;
        private static final String errorCode = "1";
        private static final String errorMsg = "参数格式错误";

        public FormatErrorExecution() {
            super(baseCode + errorCode, errorMsg);
        }

        public FormatErrorExecution(String message) {
            super(baseCode + errorCode, message);
        }
    }

    /**
     * 参数为空
     */
    public static class EmptyExecution extends CustomBaseException {
        @Serial
        private static final long serialVersionUID = 3555714415375055302L;
        private static final String errorCode = "2";
        private static final String errorMsg = "参数为空";

        public EmptyExecution() {
            super(baseCode + errorCode, errorMsg);
        }

        public EmptyExecution(String message) {
            super(baseCode + errorCode, message);
        }
    }

    /**
     * 参数缺失
     */
    public static class NotFoundExecution extends CustomBaseException {
        @Serial
        private static final long serialVersionUID = 3555714415375055302L;
        private static final String errorCode = "3";
        private static final String errorMsg = "参数缺失";

        public NotFoundExecution() {
            super(baseCode + errorCode, errorMsg);
        }

        public NotFoundExecution(String message) {
            super(baseCode + errorCode, message);
        }
    }

}
