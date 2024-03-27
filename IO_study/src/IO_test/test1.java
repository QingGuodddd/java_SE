package IO_test;

import java.util.*;

/**
 * @author guoqing
 * @create 2024-03-02-15:41
 * 泛型在Comparator及Treemap中的应用
 */
public class test1 {

    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>(new A());
        map.put("g",21);
        map.put("z",22);
        map.put("o",23);

        System.out.println(map);

        Set< Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = set.iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,Integer> entry= iterator.next();
            System.out.println(entry.getKey() + entry.getValue());
        }




    }

}




class A implements Comparator<String>
{


    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}