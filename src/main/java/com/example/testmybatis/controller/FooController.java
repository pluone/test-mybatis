package com.example.testmybatis.controller;

import com.example.testmybatis.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
    @Autowired
    private FooService fooService;

    @GetMapping("/test1")
    public String test() {
        fooService.testSelect();
        return "success";
    }

    @PostMapping("/test2")
    public int test2(String name, Integer id) {
        return fooService.testUpdate(name, id);
    }
}
