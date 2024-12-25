package com.xue.scaffolding.customeException.config;

import com.xue.scaffolding.customeException.bean.CustomBaseException;
import lombok.extern.slf4j.Slf4j;
import org.example.scaffolding.bean.result.CommonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Optional;

/**
 * 通用异常处理类
 */
@RestControllerAdvice
@ResponseBody
@Slf4j
public class CustomGlobalExceptionHandler {
    /**
     * 业务异常处理
     *
     * @param customBaseException
     * @return
     */
    @ExceptionHandler(CustomBaseException.class)
    public CommonResult<String> customBaseException(CustomBaseException customBaseException) {
        //日志记录放在专门的日志处理类中 不在这里处理 这里处理对前端的返回
        return CommonResult.failResult(
                Optional.ofNullable(customBaseException.getErrorCode()).orElse(CommonResult.failCode)
                , Optional.ofNullable(customBaseException.getMessage()).orElse(CommonResult.failMessage)
        );
    }

    /**
     * 通用异常处理(用于处理不可预知的异常)
     */
    @ExceptionHandler(Exception.class)
    public CommonResult<String> exceptionHandler(Exception ex) {
        //日志记录放在专门的日志处理类中 不在这里处理 这里处理对前端的返回
        return CommonResult.failResult();
    }
}
