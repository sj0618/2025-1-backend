package com.example.todo_api.HW;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@RequiredArgsConstructor
@Getter
public class MyController {
    private final MyService myService;
    public void controllerMethod() {
        System.out.println("contoller");
        myService.serviceMethod();
    }
}
