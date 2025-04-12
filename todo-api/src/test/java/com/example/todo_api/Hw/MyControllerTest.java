package com.example.todo_api.Hw;

import com.example.todo_api.HW.MyController;
import com.example.todo_api.HW.MyRepository;
import com.example.todo_api.HW.MyService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyControllerTest {
    @Autowired
    MyController myController;

    @Autowired
    MyRepository myRepository;

    @Autowired
    MyService myService;

    @Test
    public void test(){

        myController.controllerMethod();
        System.out.println("myController 실행끝.");
    }
}
