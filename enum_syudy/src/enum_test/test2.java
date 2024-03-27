package enum_test;

import java.util.Arrays;

/**
 * @author guoqing
 * @create 2024-03-16-15:05
 * 复习回顾枚举类的定义及常用方法
 */
public class test2 {

    public static void main(String[] args) {
        Season_test[] tests = Season_test.values();
        System.out.println(Arrays.toString(tests));


    }
}



enum  Season_test
{
    //提供枚举类的对象
    spring_test("春",1),
    summer_test("夏",2),
    autumn_test("秋",3),
    winter_test("冬",4);

    //定义属性
    private final String name;
    private final int num;

    //定义构造器
    Season_test(String name,int num)
    {
        this.name = name;
        this.num = num;
    }
    public int getNum()
    {
        return num;
    }

        }
