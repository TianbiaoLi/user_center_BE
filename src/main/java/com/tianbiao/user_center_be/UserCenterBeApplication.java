package com.tianbiao.user_center_be;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tianbiao.user_center_be.mapper")
public class UserCenterBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterBeApplication.class, args);
    }

}
