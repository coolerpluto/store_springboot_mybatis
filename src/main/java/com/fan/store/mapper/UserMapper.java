package com.fan.store.mapper;

import com.fan.store.pojo.User;

/**
 * @author: fc
 * @date: 2022/9/9 16:22
 */
public interface UserMapper {
    Integer insert(User user);

    User findByUsername(String username);
}
