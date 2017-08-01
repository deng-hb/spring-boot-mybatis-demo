package com.denghb.demo.mapper;

import com.denghb.demo.domain.User;

import java.util.List;

/**
 * Created by ppd on 2017/8/1.
 */
public interface UserMapper {

    List<User> listAll();

    void queryById(long id);

    void create(User user);

    void update(User user);

    void delete(long id);
}
