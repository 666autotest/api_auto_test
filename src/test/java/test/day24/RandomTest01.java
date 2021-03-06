package test.day24;

import java.util.Random;

/**
 * 题目：根据int变量n的值，来获取随机数字，范围是[1,n],可以取到1也可以取到n.
 *
 * 思路：
 * 1.定义一个int变量n,随意赋值
 * 2.要使用Random：三个步骤，导包、创建、使用
 * 3.如果写10，那么就是0~9，然而想要1~10，可以发现：整体+1即可。
 * 4.答应随机数字
 */
public class RandomTest01 {
    public static void main(String[] args) {
        int n = 5;
        Random r= new Random(n);
        for (int i = 0; i < 100; i++) {
            int result =r.nextInt(n)+1;//整体+1就可以取到N的值，本来是[0,n];整体+1后变成[1,n+1],即[1,n]
            System.out.println(result);
        }
    }
}
