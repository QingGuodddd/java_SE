package test;

/**
 * @author guoqing
 * @create 2024-02-26-10:42
 * 线程同步的测试1
 */
public class test3 {
    public static void main(String[] args) {
        Accout accout = new Accout();
        Customer customer = new Customer(accout);
        Thread test_Thread_1 = new Thread(customer);
        Thread test_Thread_2 = new Thread(customer);
        test_Thread_1.setName("顾客1");
        test_Thread_2.setName("顾客2");
        test_Thread_1.start();
        test_Thread_2.start();

    }

}



class Accout
{
    private  int cash = 0;
    public void getcash()
    {
        cash = cash + 1000;
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }

    public int getCash()
    {
        return cash;
    }

}


class Customer implements Runnable
{
    Accout accout;
    Customer(Accout accout)
    {
        this.accout = accout;
    }
    @Override
    public void run() {
        for(int i = 0;i < 3;i++)
        {
            synchronized (this)
            {
                accout.getcash();
                System.out.println(Thread.currentThread().getName()+"存了1000元钱，"+"现在总计"+accout.getCash());
            }

        }

    }
}