package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BeanParent1 {

    final private BeanChilds beanChilds;

    public BeanParent1(BeanChilds beanChilds) {
        this.beanChilds = beanChilds;
    }
}
