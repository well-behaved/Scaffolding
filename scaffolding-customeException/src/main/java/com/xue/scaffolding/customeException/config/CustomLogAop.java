package com.xue.scaffolding.customeException.config;

import com.xue.scaffolding.customeException.bean.CustomBaseException;
import com.xue.scaffolding.customeException.utils.JsonUtils;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
//

/**
 * 全局日志处理
 */
@Aspect
@Component
@Slf4j
public class CustomLogAop {

    /**
     * 配置切点 目标为所有的controller
     */
    @Pointcut("execution(public * com.xue.scaffolding.customeException.controller..*.*(..))")
    public void log() {
    }

    /**
     * 前置通知
     */
    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        CustomLogDTO customLogDTO = new CustomLogDTO();
        customLogDTO.setUrl(request.getRequestURL().toString());
        customLogDTO.setHttpMethod(request.getMethod());
        customLogDTO.setParameter(JsonUtils.toJsonString(request.getParameterMap()));
        customLogDTO.setIp(request.getRemoteAddr());
        customLogDTO.setClassMethod(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("REQUEST : " + JsonUtils.toJsonString(customLogDTO));
    }

    @AfterReturning(returning = "resultValue", pointcut = "log()")
    public void doAfterReturning(Object resultValue) {
        // 处理完请求，返回内容
        log.info("RESPONSE : " + JsonUtils.toJsonString(resultValue));
    }

    /**
     * 异常日志打印
     */
    @AfterThrowing(throwing = "exception", pointcut = "log()")
    public void doAfterThrowing(Exception exception) {
        if (exception instanceof CustomBaseException) {
            //如果是业务异常打印日志就好
            log.info("RESPONSE : " + exception.getMessage());
        } else {
            // 处理完请求，返回内容
            log.error("请求出错", exception);
        }

    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    private static class CustomLogDTO {
        /**
         * 请求地址
         */
        private String url;
        /**
         * 请求方法
         */
        private String httpMethod;
        /**
         * 请求参数
         */
        private String parameter;
        /**
         * 请求ip
         */
        private String ip;
        /**
         * 类方法
         */
        private String classMethod;
    }
}

