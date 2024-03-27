package generics_test;

import java.util.HashSet;

/**
 * @author guoqing
 * @create 2024-03-02-15:28
 * 泛型通配符的测试
 */
public class test4 {

    public static void main(String[] args) {
        HashSet<person> map = new HashSet<>();
        person p1 = new person("a",24);
        person p2 = new person("b",23);
        map.add(p1);
        map.add(p2);
        HashSet<?> map_test = new HashSet<>();
        map_test = map;
        //对于集合类元素，可读不可写
        System.out.println(map_test);



    }

    //泛型方法
    public <E> E test(int a,E e)
    {
        return e;
    }
}
