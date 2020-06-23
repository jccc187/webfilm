package com.springboot.webfilm.dao;

import com.springboot.webfilm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
