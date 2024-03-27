package test_shiyan4;

/**
 * @author guoqing
 * @create 2024-03-07-11:44
 */
public class Graduate implements  TeacherInterface,StudentIterface{
    private String name;
    private char sex;
    private int age;
    private double fee;
    private double pay;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public Graduate() {
    }

    public Graduate(String name, char sex, int age, double fee, double pay) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.fee = fee;
        this.pay = pay;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }


    @Override
    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }


    public void compare()
    {
        if(this.pay - this.fee <= 2000)
        {
            System.out.println("provide a load");
        }
    }
}
