package com;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("ClassicalMusic.doMyInit()");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("ClassicalMusic.doMyDestroy()");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
