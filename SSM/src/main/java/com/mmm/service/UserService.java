package com.mmm.service;

import com.mmm.bean.User;
import org.springframework.stereotype.Service;

public interface UserService {
    /**
     * 登录
     */

    User login(String name ,String pwd);

}
