package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BeanParent2 {

    final private BeanChilds beanChilds;

    public BeanParent2(BeanChilds beanChilds) {
        this.beanChilds = beanChilds;
    }
}
