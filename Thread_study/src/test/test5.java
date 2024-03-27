package test;

import java.util.concurrent.*;

/**
 * @author guoqing
 * @create 2024-02-26-20:47
 */
public class test5 {

    public static void main(String[] args) {
        //创建线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        //管理线程池的参数
//        ThreadPoolExecutor service_new = (ThreadPoolExecutor) service;
//        service_new.setCorePoolSize();
//        service_new.setKeepAliveTime();

        //service.execute();引入runnable线程模式
        callable_test2 a = new callable_test2();
        FutureTask futureTask = new FutureTask(a);

        service.submit(futureTask);//引入callable线程模式
        service.shutdown();//关闭线程池
    }
}


class callable_test2 implements Callable
{
    @Override
    public Object call() throws Exception {
        Integer a = 10000;
        for(int i = 0;i <= 100;i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
            else
                continue;
        }
        return a;
    }

}