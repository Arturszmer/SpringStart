package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BeanParent3 {

    //wstrzykiwanie childa
    final private BeanChilds beanChilds;

    public BeanParent3(BeanChilds beanChilds) {
        this.beanChilds = beanChilds;
    }
}
