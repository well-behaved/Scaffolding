package com.xue.scaffolding.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 这是一个 Spring Boot 应用程序的入口类。
 * 它使用 @SpringBootApplication 注解来自动配置 Spring Boot 应用。
 * <p>
 * SpringBootServletInitializer 修改为了支持 Servlet 3.0 规范。使用war包启动
 */

@SpringBootApplication
public class ScaffoldingDemo1Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ScaffoldingDemo1Application.class);
    }

    /**
     * 程序的入口方法。
     * 它调用 SpringApplication.run 方法来启动 Spring Boot 应用。
     *
     * @param args 命令行参数。
     */
    public static void main(String[] args) {
        SpringApplication.run(ScaffoldingDemo1Application.class, args);
    }
}
