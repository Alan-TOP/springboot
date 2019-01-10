package com.alan.springboot.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Alan
 * @create: 2019-01-08 10:53
 **/
@Component
//@ConfigurationProperties(prefix = "com.alan")//如果采用该方式，下面变量中即可不用@Value注解，保持配置文件和变量名一致即可
public final class WorkProperties {

    @Value("${com.alan.title}")
    private  String title;
    @Value("${com.alan.description}")
    private  String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
