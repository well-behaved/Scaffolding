package com.xue.scaffolding.customeException.bean;


import java.io.Serial;

/**
 * 自定义受检异常类 基类
 * 异常类最好实现序列化方法 方便序列化
 */
public class CustomBaseException extends Exception implements java.io.Serializable {
    /**
     * 序列化ID
     * serialVersionUID 是 Java 序列化机制中用于版本控制的一个字段。它确保同一个类在不同版本间可以安全地进行序列化和反序列化。具体来说，serialVersionUID 允许你控制类的不同版本之间的兼容性。
     * 序列化：在序列化时，Java 会将对象的 serialVersionUID 与数据一起保存到文件中。
     * 反序列化：在反序列化时，Java 会检查当前类的 serialVersionUID 是否与序列化时的 serialVersionUID 相匹配。如果不匹配，Java 会抛出 InvalidClassException，提示类不兼容。
     */
    // @Serial 注解是 JDK 14 引入的，它的主要作用是标识与序列化相关的字段或方法，特别是用于标识 serialVersionUID、readObject、writeObject、readResolve 和 writeReplace 等序列化特殊方法。它并不是强制性的，但它提供了一种更具可读性和语义化的方式来标注序列化代码。
    @Serial
    private static final long serialVersionUID = 1L;
    /*
     * 错误代码
     */
    private String errorCode;

    // 默认构造方法
    public CustomBaseException() {
        super();
    }

    // 带错误信息的构造方法
    public CustomBaseException(String message) {
        super(message);
    }

    // 带错误信息和原因的构造方法
    public CustomBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    // 带原因的构造方法
    public CustomBaseException(Throwable cause) {
        super(cause);
    }

    // 带错误信息和错误代码的构造方法
    public CustomBaseException( String errorCode,String message) {
        super(message);
        this.errorCode = errorCode;
    }

    // 获取错误代码
    public String getErrorCode() {
        return errorCode;
    }
}
