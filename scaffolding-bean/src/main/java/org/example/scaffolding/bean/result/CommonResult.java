package org.example.scaffolding.bean.result;

import lombok.Getter;
import lombok.Setter;

/**
 * 通用返回结果
 */
@Getter
@Setter
public class CommonResult<T> {
    /**
     * 成功码
     */
    public static final String successCode = "200";
    /**
     * 成功信息
     */
    public static final String successMessage = "成功";
    /**
     * 失败码
     */
    public static final String failCode = "500";
    /**
     * 失败信息
     */
    public static final String failMessage = "失败";
    /**
     * 返回码
     */
    private String code;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;

    /**
     * 是否成功
     */
    public boolean success() {
        return successCode.equals(code);
    }
    /**
     * 构造方法
     */
    public CommonResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 通用成功 没有返回数据
     */
    public static <T> CommonResult<T> successResult() {
        return new CommonResult<T>(successCode, successMessage);
    }

    /**
     * 通用成功 有返回数据
     */
    public static <T> CommonResult<T> successResult(T data) {
        return new CommonResult<T>(successCode, successMessage, data);
    }
    /**
     * 通用失败
     */
    public static <T> CommonResult<T> failResult() {
        return new CommonResult<T>(failCode, failMessage);
    }
    /**
     * 通用失败
     */
    public static <T> CommonResult<T> failResult(String failMessage) {
        return new CommonResult<T>(failCode, failMessage);
    }
    /**
     * 通用失败
     */
    public static <T> CommonResult<T> failResult(String code, String message) {
        return new CommonResult<T>(code, message);
    }
    /**
     * 失败
     */
    public static <T> CommonResult<T> failResult(T data) {
        return new CommonResult<T>(failCode, failMessage, data);
    }
    /**
     * 失败
     */
    public static <T> CommonResult<T> failResult(String code, String message, T data) {
        return new CommonResult<T>(code, message, data);
    }

}
