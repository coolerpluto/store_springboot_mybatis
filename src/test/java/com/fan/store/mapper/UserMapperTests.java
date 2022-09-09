package com.fan.store.mapper;

import com.fan.store.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: fc
 * @date: 2022/9/9 16:44
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTests {

    @Autowired
    UserMapper userMapper;

    /**
     *测试查询用户
     */
    @Test
    public void test01(){
        User user1 = userMapper.findByUsername("user1");
        System.out.println(user1);
    }

    /**
     * 测试插入用户
     */
    @Test
    public void test02(){
        User user = new User();
        user.setUsername("小王");
        user.setPassword("123");
        Integer rows = userMapper.insert(user);
        System.out.println(rows);
    }
}
