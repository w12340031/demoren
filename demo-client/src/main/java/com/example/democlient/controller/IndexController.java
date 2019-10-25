//package com.example.democlient.controller;
//
//import com.example.demoapi.UserService;
//import org.apache.dubbo.config.annotation.Reference;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class IndexController {
//    @Autowired
//    ApplicationContext applicationContext;
//    @Reference
//    UserService userService;
//    @RequestMapping(value = "index")
//    public String index(){
//        return userService.add();
//    }
//}
