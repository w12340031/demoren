package com.example.demosever.service;

import com.example.demoapi.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String add() {
        return "累了...";
    }
}
