package com.mmm.dao;

import com.mmm.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    /**
     * 登录
     */

    User login(String name, String pwd);


}
