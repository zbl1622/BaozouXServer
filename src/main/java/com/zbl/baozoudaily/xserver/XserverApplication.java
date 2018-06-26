package com.zbl.baozoudaily.xserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class XserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(XserverApplication.class, args);
    }
}
