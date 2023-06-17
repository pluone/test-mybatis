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
    public void testSelectThenUpdate(Integer userId) {
        User user = userExMapper.selectByPrimaryKey(userId);
        log.info("查询完毕");
        String uuid = UUID.randomUUID().toString();
        user.setName("李思-" + uuid);
        // userExMapper.updateByPrimaryKeySelective(user);
        userExMapper.updateInvokeTime(userId);
        User user1 = userExMapper.selectByPrimaryKey(userId);
        Integer invokeTime = user1.getInvokeTime();
        log.info("invoke time={}", invokeTime);
        if (invokeTime == 1) {
            initMethod();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("更新完毕");
    }

    private void initMethod() {

        log.info("执行初始化方法");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("执行初始化方法结束");
    }

    public int testUpdate(String name, Integer id) {
        int result = userExMapper.updateName(name, id);
        return result;
    }
}
