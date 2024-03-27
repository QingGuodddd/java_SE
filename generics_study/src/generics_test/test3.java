package generics_test;

import java.util.Arrays;

/**
 * @author guoqing
 * @create 2024-03-02-14:56
 * 测试数组类的多态性
 */
public class test3 {
    public static void main(String[] args) {
        student a = new student("guo",24,123);
        student b = new student("guo1",25,124);
        student c = new student("guo2",26,125);
        student[] test_student = new student[3];
        for(int i = 0;i < test_student.length;i++)
        {
            test_student[i] = a;
        }
        System.out.println(Arrays.toString(test_student));

        person_1[] test_person_1;
        test_person_1 = test_student;
        System.out.println(Arrays.toString(test_person_1));

        //test_person_1[0].getID()   由此可见数组类的多态性和类的多态性相同


    }


}



class person_1
{
    private String name;
    private int age;

    public person_1() {
    }

    public person_1(String name, int age) {
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
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class student extends person_1
{
    private int id;

    public student()
    {
        super();
    }

    public student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                '}'+super.toString();
    }
}