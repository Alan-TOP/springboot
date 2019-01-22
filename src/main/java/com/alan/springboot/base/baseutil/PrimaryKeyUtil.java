package com.alan.springboot.base.baseutil;

import java.util.UUID;

/**
 * @description:
 * @author: Alan
 * @create: 2019-01-22 10:19
 **/
public class PrimaryKeyUtil {
    /**
     * 获取主键UUID（36位）
     * @return
     */
    public static String getUUID(){
        UUID uuid=UUID.randomUUID();
        String uuidStr=uuid.toString();
        return uuidStr;
    }
}
