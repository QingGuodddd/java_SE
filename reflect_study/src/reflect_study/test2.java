package reflect_study;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author guoqing
 * @create 2024-03-06-21:52
 * 通过反射获取类的全部属性或指定属性
 */
public class test2 {
    public static void main(String[] args) {
        Class clazz = person.class;
        //获得全部属性
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields)
        {
            System.out.println(field);
        }
        //获取指定属性
        for(Field field:fields)
        {
            //输出指定类属性的权限修饰符
           int modify = field.getModifiers();
            System.out.println(Modifier.toString(modify));
            //输出指定类属性的数据类型,其他数据类型本身也属于类，所以用Class接收
            Class type = field.getType();
            System.out.println(type.getName());
            //输出指定类属性的名称
            String name = field.getName();
            System.out.println(name);

        }


    }
}
