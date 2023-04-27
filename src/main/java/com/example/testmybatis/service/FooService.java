package com.example.testmybatis.service;

import com.example.testmybatis.dao.ex.UserExMapper;
import com.example.testmybatis.model.User;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Slf4j
@Service
public class FooService {
    @Resource
    private UserExMapper userExMapper;

    public void testSelect() {
        User user = userExMapper.selectByPrimaryKey(1);
        System.out.println(user.getName());
    }

    @Transactional
    public void testSelectThenUpdate() {
        User user = userExMapper.selectByPrimaryKey(1);
        log.info("查询完毕");
        String uuid = UUID.randomUUID().toString();
        user.setName("李思-" + uuid);
        userExMapper.updateByPrimaryKeySelective(user);
        log.info("更新完毕");
    }

    public int testUpdate(String name, Integer id) {
        int result = userExMapper.updateName(name, id);
        return result;
    }
}
