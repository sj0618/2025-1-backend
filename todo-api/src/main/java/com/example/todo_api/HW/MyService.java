package com.example.todo_api.HW;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Getter
public class MyService {
    private final MyRepository myRepository;
    public void serviceMethod() {
        System.out.println("service");
        myRepository.repositoryMethod();
    }
}
