package generics_test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author guoqing
 * @create 2024-03-01-20:26
 * 泛型测试Map
 */
public class test2 {
    public static void main(String[] args) {
        HashMap<Integer, person> map = new HashMap<>();
        person p1 = new person("c",24);
        person p2 = new person("b",23);
        map.put(1,p1);
        map.put(2,p2);


        //两种遍历方法
        //第一种
        Set<HashMap.Entry<Integer, person>> set = map.entrySet();
        Iterator<HashMap.Entry<Integer, person>> iterator = set.iterator();
        while(iterator.hasNext())
        {
            HashMap.Entry<Integer, person> e = iterator.next();
            System.out.println(e.getKey()+" "+e.getValue());

        }

        //第二种
        Set<Integer> set1 = map.keySet();
        Iterator<Integer> iterator1 = set1.iterator();
        while(iterator1.hasNext())
        {
            Integer a = iterator1.next();
            Object b = map.get(a);
            System.out.println(a+" "+b);
        }





    }

}
