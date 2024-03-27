package test;


class test_Thread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i <= 100;i++)
        {
            if(i % 2 ==0)
                System.out.println(i);
                System.out.println(Thread.currentThread().getName());
        }
    }
}

public class test1 {

    public static void main(String[] args) {
        test_Thread a = new test_Thread();
        a.start();
        System.out.println("Hello,Beijing!");
    }
}

