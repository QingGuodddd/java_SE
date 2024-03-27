package reflect_study;

/**
 * @author guoqing
 * @create 2024-03-06-21:42
 */
public class person {
    private String name;
    public int age;

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

    private person(String name) {
        this.name = name;
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void method_pri()
    {
        System.out.println("这是一个私有属性的方法");
    }

    public void method_pub()
    {
        System.out.println("这是一个公有属性的方法");
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
