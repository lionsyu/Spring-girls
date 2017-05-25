package com.spring.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by yuxin on 2017/5/24.
 */
public class TelUtils {

    /**
     * 判断是否是手机号
     * true 是
     * false 不是
     */
    public static boolean isChinaTel(String tel) throws PatternSyntaxException {
        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(tel);
        return matcher.matches();
    }
}
