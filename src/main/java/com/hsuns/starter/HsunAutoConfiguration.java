package com.hsuns.starter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 创建一个AutoConfiguration，引用定义好的配置信息；
 * 在AutoConfiguration中实现所有starter应该完成的操作，
 *
 * @author hsun
 * @version 1.0.0
 * @date 2019/12/9 22:57
 */
@Configuration
@EnableConfigurationProperties(HsunProperties.class)
public class HsunAutoConfiguration {

    @Bean
    public HsunTest hsunTest() {
        return new HsunTest();
    }
}
