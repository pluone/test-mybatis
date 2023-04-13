package com.example.testmybatis.service;

import com.example.testmybatis.dao.UserMapper;
import com.example.testmybatis.dao.ex.UserExMapper;
import com.example.testmybatis.model.User;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooService {
    @Resource
    private UserExMapper userExMapper;

    public void testSelect() {
        User user = userExMapper.selectByPrimaryKey(1);
        System.out.println(user.getName());
    }

    public int testUpdate(String name, Integer id) {
        int result = userExMapper.updateName(name, id);
        return result;
    }
}
