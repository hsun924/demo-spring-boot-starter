package com.hsuns.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 创建一个ConfigurationProperties用于保存你的配置信息
 * （如果你的项目不使用配置信息则可以跳过这一步，不过这种情况非常少见）
 *
 * @author hsun
 * @version 1.0.0
 * @date 2019/12/9 22:54
 */
@Data
@ConfigurationProperties(prefix = "hsun")
public class HsunProperties {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private String age;

    /**
     * 邮箱
     */
    private String email;


}
