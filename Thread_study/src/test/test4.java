package test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author guoqing
 * @create 2024-02-26-20:17
 */
class Callable_test implements Callable
{
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i = 1;i <= 100;i++)
        {
            sum = sum+i;
            System.out.println("这是线程"+Thread.currentThread().getName()+"生产的"+i);
        }
        return sum;
    }
}


public class test4 {
    public static void main(String[] args) {
        Callable_test callable = new Callable_test();
        FutureTask futureTask = new FutureTask(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        Object sum;

        {
            try {
                sum = futureTask.get();
                System.out.println(sum);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
