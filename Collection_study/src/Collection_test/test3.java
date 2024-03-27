package Collection_test;

import java.util.*;

/**
 * @author guoqing
 * @create 2024-03-11-11:47
 * 关于集合的一些测试（比较器，Collections，常用方法，遍历操作）
 */
public class test3 {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();
        Person person1 = new Person("a",22);
        Person person2 = new Person("b",23);
        Person person3 = new Person("c",24);
        Person person4 = new Person("d",21);
        Person person5 = new Person("e",25);
        Person person6 = new Person("e",25);
        list.add(person1);
        list.add(person2);
        list.add(person5);
        list.add(person4);
        list.add(person6);
        list.add(person3);

        Iterator iterator = list.iterator();
        while(iterator.hasNext())
        {
            Person per = (Person) iterator.next();
            if("c".equals(per.getName()))
                iterator.remove();
        }

        Collections.sort(list,new cpr());
        System.out.println(Collections.frequency(list,person6));
        for(Person person:list)
            System.out.println(person);


    }


}


class cpr implements Comparator<Person>
{

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getName() == o2.getName())
            return Double.compare(o1.getAge(), o2.getAge());
        else
            return -o1.getName().compareTo(o2.getName());
    }
}
