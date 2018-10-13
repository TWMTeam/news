package com.there.news.mapper;

import com.there.news.entity.Users;

import java.util.List;

public interface UsersMapper {

    //添加Users对象
    int insert(Users user);

    //根据用户名和密码查询User对象
    Users findUser(String uname, String password);

    //根据u_id删除用户名
    void delete(String u_id);

    //根据uid更新用户
    int update(Users user);

    //查询所有用户
    List<Users> selectUsersAll();

}
