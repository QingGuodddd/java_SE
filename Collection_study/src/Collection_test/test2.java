package Collection_test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author guoqing
 * @create 2024-02-29-11:46
 * 关于Map的测试
 */
public class test2 {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1,"guoqing");
        map.put(2,"xm");

        Set entrtSet = map.entrySet();
        Iterator iterator = entrtSet.iterator();
        while(iterator.hasNext())
        {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey()+" " + entry.getValue());
        }





    }
}


