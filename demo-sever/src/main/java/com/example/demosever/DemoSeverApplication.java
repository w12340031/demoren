package com.example.demosever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class DemoSeverApplication {
    @Autowired
    ApplicationContext applicationContext;
    public static void main(String[] args) {
        SpringApplication.run(DemoSeverApplication.class, args);
        System.out.println("server启动了");
    }

}
