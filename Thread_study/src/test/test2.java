package test;

/**
 * @author guoqing
 * @create 2024-02-23-23:46
 */

class test_Thraed implements Runnable
{
    @Override
    public void run() {
        for(int i = 0;i <= 100;i++)
        {
            if(i % 2 == 0)
                System.out.println(i);
        }
    }
}

public class test2 {
    public static void main(String[] args) {
        test_Thread test_Runnable = new test_Thread();
        Thread test = new Thread(test_Runnable);
        test.start();
    }
}
