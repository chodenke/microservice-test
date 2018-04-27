package com.chengchengkeji.microservicetest.repository;

import com.chengchengkeji.microservicetest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @author: codeke
 * @date: 2018-04-26 18:08
 * @description
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
