package com.wangfan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] ages){
        SpringApplication.run(ConfigApplication.class,ages);
    }
}
