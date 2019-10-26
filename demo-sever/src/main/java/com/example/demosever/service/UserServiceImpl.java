package com.example.demosever.service;

import com.example.demoapi.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String add() {
        System.out.println("你去买饭去吧...");
        return "渴了...饿了";
    }

    @Override
    public int sub(int max, int min) {
        return max - min;
    }
}
