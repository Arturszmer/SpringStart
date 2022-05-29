package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class BeanChilds {

    @PostConstruct
    public void createChild(){
        System.out.println("Create new Child");
    }
}
