package com.example.democlient.runner;

import com.example.demoapi.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {
    @Reference
    UserService userService;
    @Override
    public void run(String... strings) throws Exception {
        userService.add();
    }
}
