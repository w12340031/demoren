package com.example.demosever.service;

import com.example.demoapi.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String add() {
        return "渴了...困了，累了，咰水";
    }

    @Override
    public int sub(int max, int min) {
        return max - min;
    }
}
