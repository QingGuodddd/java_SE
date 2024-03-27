package agent_model_static;

/**
 * @author guoqing
 * @create 2024-03-07-21:56
 * 静态代理的测试，代理类和被代理类在编译期间就确定了
 */
public class test {
    public static void main(String[] args) {

        //先创建被代理的对象
        NikeClothFactory nike = new NikeClothFactory();

        //将被代理的对象放入代理类的对象中
        PloxyClothFactory ploxy = new PloxyClothFactory(nike);

        //执行代理
        ploxy.produceCloth();
    }
}
