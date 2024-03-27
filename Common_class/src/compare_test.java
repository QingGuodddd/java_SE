/**
 * @author guoqing
 * @create 2024-02-27-19:44
 */
public class compare_test implements Comparable{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public compare_test() {
    }

    public compare_test(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "compare_test{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof compare_test)
        {
            compare_test a = (compare_test) o;
            //方式1
            if(this.age > a.age)
                return 1;
            else if (this.age < a.age)
                return -1;
            else
                return 0;
//            //方式2
//            return Double.compare(this.age,a.age);
        }

        else
            throw new RuntimeException("输入类型不匹配");
    }
}
