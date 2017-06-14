package com.spring;

import com.spring.common.util.MathUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void test() {
        List<String> list = new ArrayList<>(20);
        list.add("aaa");

        Vector vector = new Vector(20);
        vector.add("aaa");

        Map map = new HashMap();
        Map map1 = new Hashtable();

    }


    /**
     * 网易算法题（升级之路）
     * 题目描述
     * <p>
     * 小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为 a.在接下来的一段时间内,他将会依次遇见n个怪物,
     * 每个怪物的防御力为b1，b2，b3…bn. 如果遇到的怪物防御力bi小于等于小易的当前能力值c,那么他就能轻松打败怪物,
     * 并且使得自己的能力值增加bi;如果bi大于c,那他也能打败怪物,但他的能力值只能增加bi 与c的最大公约数.那么问题来了,
     * 在一系列的锻炼后,小易的最终能力值为多少?
     * <p>
     * 输入描述:
     * <p>
     * 对于每组数据,第一行是两个整数n(1≤n<100000)表示怪物的数量和a表示小易的初始能力值.
     * 第二行n个整数，b1，b2…bn(1≤bi≤n)表示每个怪物的防御力
     * <p>
     * 输出描述:
     * <p>
     * 对于每组数据,输出一行。每行仅包含一个整数,表示小易的最终能力值
     * <p>
     * 输入例子:
     * <p>
     * 3 50
     * 50 105 200
     * 5 20
     * 30 20 15 40 100
     * <p>
     * 输出例子:
     * <p>
     * 110
     * 205
     **/
    @Test
    public void test1() {
        //怪物个数
        int n = 5;
        //小易的初始能力
        int a = 20;
        //怪物防御力
        List<Integer> b = new ArrayList<>();
        b.add(30);
        b.add(20);
        b.add(15);
        b.add(40);
        b.add(100);

        for (int i = 0; i < n; i++) {
            if (b.get(i) <= a) {
                a = a + b.get(i);
            } else {
                a = a + MathUtils.divisor(a, b.get(i));
            }
        }

        System.out.println("最终结果：" + a);
    }


    /**
     * A、B、C、D、E 五个人捕鱼后已凌晨，大家便睡觉。
     * 早上A第一个醒来，将鱼均分成五份，把多余的一条鱼扔掉，拿走自己的一份，
     * B第二个醒来，也将鱼均分为五份，把多余的一条鱼扔掉，拿走自己的一份。
     * CDE依次醒来，也按同样的方法拿鱼，问他们合伙至少捕了几条鱼？
     * <p>
     * A. 9
     * B. 31
     * C. 3121
     * D. 3906
     **/
    @Test
    public void test2() {
        //设 总共x条鱼
        int total = fish(5, 1);
        System.out.println("至少捕了" + total + "条鱼");
    }

    public int fish(int num, int fishNum) {
        if (num > 0) {
            fishNum = fishNum * 5 + 1;
            num--;
            if (num > 0) {
                fish(num, fishNum);
            } else {
                return fishNum;
            }
        }
        return -1;
    }


}
