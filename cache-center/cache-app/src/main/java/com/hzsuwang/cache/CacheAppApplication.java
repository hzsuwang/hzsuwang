package com.hzsuwang.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages ={ "com.hzsuwang.cache"})
@EnableAutoConfiguration(exclude={ DataSourceAutoConfiguration.class})
@ImportResource(value = { "classpath:dubbo_register.xml", "classpath:dubbo_provider.xml", "classpath:dubbo_consumer.xml"})
public class CacheAppApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CacheAppApplication.class, args);
    }

    /**
     * 实现SpringBootServletInitializer可以让spring-boot项目在web容器中运行
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(this.getClass());
        return super.configure(builder);
    }
}
