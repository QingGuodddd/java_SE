package reflect_study;

/**
 * @author guoqing
 * @create 2024-03-05-22:27
 * 测试Class的4种获取方式
 */
public class test1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //方法1，通过调用运行时类的属性
        Class clazz1 = person.class;

        //方法2，通过运行时类的对象调用getclass( )方法
        person person_instance = new person();
        Class clazz2 = person_instance.getClass();

        //方法3，通过调用Class的静态方法：forName(String classPath)
        Class clazz3 = Class.forName("reflect_study.person");

        //方法4，通过调用当前类的加载器（不常用）
        ClassLoader classLoader = test1.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("reflect_study.person");

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
        System.out.println(clazz1 == clazz4);



    }
}
