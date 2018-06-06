package com.mmm;

import com.mmm.bean.User;
import com.mmm.dao.UserMapper;
import com.mmm.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class a {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        User user=userService.login("admin","1");
        System.out.println(user);
    }
}
