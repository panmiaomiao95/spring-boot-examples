package com.neo.controller;

import com.neo.dao.UserDao;
import com.neo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Admin on 2018/3/9.
 */
@Controller
@RequestMapping(value = "/user_info")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/saveOrder")
    @ResponseBody
    public void addInfo(){
        UserEntity userEntity=new UserEntity();
        userEntity.setUserName("admin");
        userEntity.setPassWord("123456");
        userEntity.setId(5L);
        userDao.saveUser(userEntity);
    }

    @RequestMapping("/findByName")
    @ResponseBody
    public UserEntity findByName(){
        UserEntity userEntity=userDao.findUserByUserName("admin");
        return userEntity;
    }
}
