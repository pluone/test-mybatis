package com.example.testmybatis.dao.ex;

import com.example.testmybatis.dao.UserMapper;
import org.apache.ibatis.annotations.Param;

public interface UserExMapper extends UserMapper {
    int updateName(@Param("name") String name, @Param("id") Integer id);
}
