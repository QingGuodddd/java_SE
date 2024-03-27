import java.util.Arrays;
import java.util.Comparator;

/**
 * @author guoqing
 * @create 2024-02-26-21:47
 */
public class test1{


    public static void main(String[] args) {

        compare_test[] a = new compare_test[5];
        a[0] = new compare_test(10,"a");
        a[1] = new compare_test(11,"c");
        a[2] = new compare_test(14,"d");
        a[3] = new compare_test(13,"f");
        a[4] = new compare_test(18,"a");


        //测试comparable方法
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
//        //测试comparator方法
//        Arrays.sort(a,new comparator_test());
//        System.out.println(Arrays.toString(a));




    }


}



class comparator_test implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof  compare_test & o2 instanceof compare_test)
        {
            compare_test a = (compare_test) o1;
            compare_test b = (compare_test) o2;
            if(a.getName().equals(b.getName()))
                return -Double.compare(a.getAge(),b.getAge());
            else
                return a.getName().compareTo(b.getName());

        }
        throw new RuntimeException("输入类型不匹配");
    }
}