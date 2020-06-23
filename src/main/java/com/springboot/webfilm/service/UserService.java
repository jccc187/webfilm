package com.springboot.webfilm.service;

import com.springboot.webfilm.dao.UserDao;
import com.springboot.webfilm.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public UserService() {
    }

    public List<User> findbyid(int uid) {
        List<User> res = this.userDao.findAll();
        return res;
    }
}

