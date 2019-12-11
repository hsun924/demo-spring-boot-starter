package com.hsuns.starter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * TODO hsun 添加注释
 *
 * @author hsun
 * @version 1.0.0
 * @date 2019/12/9 23:20
 */
public class HsunTest {

    @Autowired
    private HsunProperties properties;

    public void hi() {
        System.out.println("Hi " + properties.getName() + ", your age is : " + properties.getAge() + ", and your email is :" + properties.getEmail());
    }
}
