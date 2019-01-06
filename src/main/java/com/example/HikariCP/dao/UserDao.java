package com.example.HikariCP.dao;

import com.example.HikariCP.entity.User;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @author wys
 * created in 16:35 2019/1/4
 */
@Repository
public interface UserDao extends BaseMapper<User> {
}
