package reflect_study;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author guoqing
 * @create 2024-03-07-16:53
 * 反射调用指定的属性、方法、构造器
 */
public class test3 {
    public static void main(String[] args) throws Exception {
        //直接生成对象方式1
        Class clazz = Class.forName("reflect_study.person");
        person person_1 = (person) clazz.newInstance();
        //直接生成对象方式2
        person person_3 = (person) Class.forName("reflect_study.person").newInstance();


        //调用指定的属性
        Field name = clazz.getDeclaredField("name");
        Field age = clazz.getDeclaredField("age");

        name.setAccessible(true);age.setAccessible(true);//开权限

        name.set(person_1,"郭庆");age.set(person_1,24);//修改变量


        //调用指定的方法
        Method method_1 = clazz.getDeclaredMethod("method_pri");
        Method method_2 = clazz.getDeclaredMethod("getName");
        method_1.setAccessible(true);

        method_1.invoke(person_1);
        System.out.println(method_2.invoke(person_1));

        //调用指定的构造器
        Constructor<person> constructor = clazz.getDeclaredConstructor(String.class,int.class);
        person person_2 = constructor.newInstance("guoqing",24);
        System.out.println(method_2.invoke(person_2));
    }

}
