package com.example.todo_api.HW;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Component
@Repository
@Getter
public class MyRepository {
    public void repositoryMethod() {
        System.out.println("repository");
    }
}
