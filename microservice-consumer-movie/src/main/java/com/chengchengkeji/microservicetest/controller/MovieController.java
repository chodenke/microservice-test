package com.chengchengkeji.microservicetest.controller;

import com.chengchengkeji.microservicetest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @author: codeke
 * @date: 2018-04-27 9:19
 * @description
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userServiceUrl}")
    private String userServiceUrl;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        System.out.println("userServiceUrl = " + userServiceUrl);
        return this.restTemplate.getForObject(userServiceUrl + "user/" + id, User.class);
    }

    @GetMapping("/user-instance")
    public List<ServiceInstance> showInfo() {
        return this.discoveryClient.getInstances("microservice-provider-user");
    }
}
