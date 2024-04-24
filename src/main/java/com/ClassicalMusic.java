package com;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
