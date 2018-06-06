package com.mmm.controller;


import com.mmm.bean.User;
import com.mmm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(String userName, String password, HttpSession session){
        User user =userService.login(userName,password);
        session.setAttribute("user",user);
        System.out.println(user);
        return new ModelAndView("success");
    }


}
