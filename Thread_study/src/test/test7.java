package test;

import java.lang.reflect.Method;

/**
 * @author guoqing
 * @create 2024-03-10-23:07
 * 多线程通信测试，在不同的runnable接口下，一定注意while循环条件是否会导致死锁
 */
public class test7 {

    public static void main(String[] args) throws Exception {

        //通过反射创建Products对象
        Class clazz = Products.class;
        Products products = (Products) clazz.newInstance();
        Method method = clazz.getDeclaredMethod("setTickets",int.class);
        method.setAccessible(true);
        method.invoke(products,100);

//        System.out.println(products.getTickets());

        //开始两组线程的通信
        A1 a1 = new A1(products);
        A2 a2 = new A2(products);

        Thread b1 = new Thread(a1);
        Thread b2 = new Thread(a2);

        b1.setName("线程1");
        b2.setName("线程2");

        b1.start();
        b2.start();




    }
}

class Products
{
    int tickets;

    public Products() {
    }

    public Products(int tickets) {
        this.tickets = tickets;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
}



class A1 implements Runnable
{
    Products products;

    public A1(Products products) {
        this.products = products;
    }

    @Override
    public void run() {
        while (true)
        {
            synchronized (products)
            {
                products.notify();
                if(products.getTickets() > 0)
                {
                    System.out.println(Thread.currentThread().getName()+"售卖的第"+products.tickets+"个产品");
                    products.tickets--;
                }
                else
                    break;
                try {
                    products.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }



    }
}


class A2 implements Runnable
{
    Products products;

    public A2(Products products) {
        this.products = products;
    }

    @Override
    public void run() {
        while (true)
        {
            synchronized (products)
            {
                products.notify();
                if(products.getTickets() > 0)
                {
                    System.out.println(Thread.currentThread().getName()+"售卖的第"+products.tickets+"个产品");
                    products.tickets--;
                }
                else
                    break;
                try {
                    products.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }



    }
}



