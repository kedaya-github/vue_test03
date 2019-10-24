package com.czxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 遗憾就遗憾吧
 * @Date 2019/10/22
 * @jdk 1.8
 */
@SpringBootApplication
public class MyBoot {
    public static void main(String[] args) {
        SpringApplication.run(MyBoot.class , args);
        System.out.println("启动");
    }
}
