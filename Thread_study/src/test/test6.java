package test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author guoqing
 * @create 2024-03-10-21:26
 * 线程通信的测试1,在同一个runnable接口下
 */
public class test6 {
    public static void main(String[] args) {
        A a = new A();
        Thread a1= new Thread(a);
        Thread a2 = new Thread(a);
        a1.setName("线程1");
        a2.setName("线程2");
        a1.start();
        a2.start();


    }




}



class A implements Runnable{
    int tickets = 1000;

    @Override
    public void run() {
        while(true)
        {
            synchronized (this)
            {
                try {
                        notify();
                        if(tickets > 0)
                            System.out.println(Thread.currentThread().getName() + "售出第" + (tickets--) + "张票");
                        else
                            break;
                        wait();



                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        }
    }









    }
