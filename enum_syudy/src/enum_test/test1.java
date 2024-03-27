package enum_test;

import java.util.Arrays;

/**
 * @author guoqing
 * @create 2024-02-27-20:43
 * 用于使用enum关键字创建枚举类
 */
public class test1 {

    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring.getName());
        //利用values( )方法，获得枚举类的所有对象，注意该方法在父类中是静态的
        Season[] seasons = Season.values();
        System.out.println(Arrays.toString(seasons));

        //利用valueOf( )方法，用字符串查找枚举类中的同名对象,注意该方法在父类中是静态的
        Season summer = Season.valueOf("SUMMER");
        System.out.println(summer);

    }
}


enum Season
{
    //1.提供当前枚举类的对象（默认为public static final类型的）
    SPRING("春天"),
    SUMMER("夏天"),
    AUTUMN("秋天"),
    WINTER("冬天");

    //2.提供类的属性
    private final String name;

    //3.提供构造器（已自动私有化设置，需完成final属性的赋值）
    Season(String name)
    {
        this.name = name;
    }

    //4.可以补充一些需求(注意一般不需要重写toString方法）
    public String getName()
    {
        return this.name;
    }
}
