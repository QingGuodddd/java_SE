package agent_model_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author guoqing
 * @create 2024-03-08-13:57
 * 仿敲动态代理类
 */
public class ProxyFactory_imitate {
    //解决问题1，根据被代理类创建代理类的对象
    public static Object getProxyFactory_imitate(Object obj)
    {
        GetInvocationHandle getInvocationHandle = new GetInvocationHandle(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),getInvocationHandle);
    }


}

//解决问题2，通过调用代理对象的方法，实现调用被代理类对象的同名方法
class GetInvocationHandle implements InvocationHandler {

    //先创建被代理对象
    Object obj;
    GetInvocationHandle(Object obj)
    {
        this.obj = obj;
    }

    //调用被代理对象的同名方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj,args);
    }

    

}
