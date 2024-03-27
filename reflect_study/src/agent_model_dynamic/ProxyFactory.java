package agent_model_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author guoqing
 * @create 2024-03-07-22:21
 * 动态的代理类
 * 要想实现动态代理，需要解决的问题?
 * 问题一:如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象。
 * 问题二:当通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法。
 */
public class ProxyFactory {


    //调用此方法，返回一个被代理的对象，解决问题1
    public static Object getProxyInstance(Object obj)//传入被代理类的对象
    {
        //这部分主要是完成MyInvocationHandle( )方法中属性的初始化
        MyInvocationHandle handler = new MyInvocationHandle(obj);


        //核心是根据被代理类的对象，返回代理类的对象
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),handler);

    }


}

//当我们通过代理类的对象，调用方法a时，就会自动的调用如下的方法：invoke( )
//将被代理类要执行的方法a的功能就声明在invoke( )中，解决问题2
class MyInvocationHandle implements InvocationHandler{
    private Object obj;//需要使用被代理类的对象进行赋值

    MyInvocationHandle(Object obj)
    {
        this.obj = obj;
    }



    @Override//代理类对象，代理类重写的同名方法，参数
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //method即为代理类对象调用的方法，此方法也同样作为了被代理类对象要调用的方法
        //obj:被代理类的对象
        Object returnValue = method.invoke(obj,args);
        //上述方法的返回值就作为，代理类和被代理类中invoke( )返回值
        return returnValue;

        //这个方法体内也可以加入一些通过的结构或者方法进行丰富，每有一次被代理对象的方法被调用，即会执行一次此方法体
    }
}
