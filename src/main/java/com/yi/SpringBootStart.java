package com.yi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yisy
 * @date 2020-03-11
 * springboot启动类
 */
@SpringBootApplication
@MapperScan(value = {"com.yi.dao"})
public class SpringBootStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStart.class,args);
    }
}
