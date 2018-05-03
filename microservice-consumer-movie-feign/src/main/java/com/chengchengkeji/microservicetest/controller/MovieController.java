package com.chengchengkeji.microservicetest.controller;

import com.chengchengkeji.microservicetest.entity.User;
import com.chengchengkeji.microservicetest.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @author: codeke
 * @date: 2018-04-27 9:19
 * @description
 */
@RestController
public class MovieController {

    @Autowired private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.userFeignClient.findById(id);
    }


}
