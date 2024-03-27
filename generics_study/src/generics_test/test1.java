package generics_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author guoqing
 * @create 2024-03-01-20:00
 * 泛型测试_ArrayList
 */
public class test1 {

    public static void main(String[] args) {

        ArrayList<person> p = new ArrayList<>();
        person p1 = new person("c",24);
        person p2 = new person("b",23);
        p.add(p1);
        p.add(p2);
        System.out.println(p);
        Collections.sort(p);
        System.out.println(p);
        Iterator<person> iterator = p.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }


}



class person implements Comparable<person>
{
    private String name;
    private int age;

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

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(person o) {
        return this.getName().compareTo(o.getName());
    }
}