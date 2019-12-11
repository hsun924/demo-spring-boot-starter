package com.hsuns.starter;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.*;

/**
 * EnableHsunStarter注解
 * 也可以在spring.factories配置文件中进行声明
 * 在src/main/resources下新建文件夹META-INF，并在其下创建spring.factories文件，
 * 把HsunAutoConfiguration这个类加入spring.factories配置文件中进行声明
 *
 * @author hsun
 * @version 1.0.0
 * @date 2019/12/10 14:58
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//声明引入自动加载HsunAutoConfiguration类
@ImportAutoConfiguration(HsunAutoConfiguration.class)
public @interface EnableHsunStarter {

}
