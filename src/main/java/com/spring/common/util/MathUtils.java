package com.spring.common.util;

/**
 * Created by yuxin on 2017/6/9.
 */
public class MathUtils {

    //求最大公约数
    public static int divisor(int m, int n) {
        int max;
        int min;
        if (m == n) {
            return m;
        } else if (m > n) {
            max = m;
            min = n;
        } else {
            max = n;
            min = m;
        }
        if (max % min == 0) {
            return min;
        } else {
            return divisor(min, max % min);
        }
    }
}
