package com.chengchengkeji.microservicetest.controller;

import com.chengchengkeji.microservicetest.entity.User;
import com.chengchengkeji.microservicetest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @author: codeke
 * @date: 2018-04-26 18:09
 * @description
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }
}
