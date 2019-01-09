package com.alan.springboot.util;

/**
 * @description:字符处理工具
 * @author: Alan
 * @create: 2019-01-04 10:33
 **/
public final class StringUtil {
    /**
     * @Descriptionnull转字符串
     */
    public  static  String null2String(String paramString){
        return paramString == null ? "" :paramString;
    }
    /**
     * @Description 判断对象是否为空
     */
    public static boolean isEmpty(Object obj) {
        return obj == null || "".equals(obj);
    }
    /**
     * @Description 判断对象是否不为空
     */
    public static boolean isNotEmpty(Object obj) {
        return obj != null && !"".equals(obj);
    }
}
