package com.alan.springboot.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Alan
 * @create: 2019-01-08 10:53
 **/
@Component
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
