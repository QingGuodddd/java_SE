package agent_model_dynamic;
import agent_model_static.*;


/**
 * @author guoqing
 * @create 2024-03-08-13:17
 */
public class test {

    public static void main(String[] args) {
        //被代理类1
        SuperMan superMan = new SuperMan();
        // proxyFactory为代理类的对象
        Human proxyFactory = (Human) ProxyFactory.getProxyInstance(superMan);
        //通过代理类对象调用方法时，会自动的调用被代理类中同名的方法
        System.out.println(proxyFactory.getBelief());
        proxyFactory.eat("kfc");

        //被代理类2
        NikeClothFactory nike = new NikeClothFactory();
        // proxyFactory_2为代理类的对象
        ClothFactory proxyFactory_2 = (ClothFactory) ProxyFactory.getProxyInstance(nike);
        //通过代理类对象调用方法时，会自动的调用被代理类中同名的方法
        proxyFactory_2.produceCloth();


        //测试仿写的动态代理
        SuperMan superMan1 = new SuperMan();
        Human proxy = (Human) ProxyFactory_imitate.getProxyFactory_imitate(superMan1);
        System.out.println(proxy.getBelief());
        proxy.eat("MM");
    }
}
