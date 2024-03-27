package Collection_test;

import java.util.*;

/**
 * @author guoqing
 * @create 2024-02-28-11:03
 * 关于Collection的测试
 */
public class test1 {

    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(1232);
        coll.add("abc");
        Date d = new Date();
        coll.add(d);
        coll.add(new Person("guo",24));
        coll.remove(d);
        System.out.println(coll);

        System.out.println(coll.contains("abcd"));
        System.out.println(coll.contains(new Person("guo", 24)));

//        Object[] arr = coll.toArray();
//        System.out.println(Arrays.toString(arr));

        //使用inerator方法遍历
        Iterator iterator_new = coll.iterator();
        while(iterator_new.hasNext())
        {
            System.out.println(iterator_new.next());
        }

        //使用增强for循环方法
        for(Object obj:coll)
        {
            System.out.println(obj);
        }


    }



}



class Person implements Comparable
{
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof  Person)
        {
            Person person = (Person) o;
            return -this.name.compareTo(person.getName());
        }
        throw new RuntimeException("传入数据类型不一致");
    }
}

