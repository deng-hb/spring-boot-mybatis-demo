package com.denghb.demo.test;

import com.denghb.demo.domain.User;
import com.denghb.demo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testCreate() throws Exception {

        User user = new User();
        user.setName("张三2");
        user.setEmail("zhangsan@qq.com");
        userMapper.create(user);

        Assert.assertEquals(1, userMapper.listAll().size());
    }


}