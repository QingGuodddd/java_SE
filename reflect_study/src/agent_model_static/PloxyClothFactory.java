package agent_model_static;

/**
 * @author guoqing
 * @create 2024-03-07-21:51
 * 静态代理类
 */
public class PloxyClothFactory implements ClothFactory{
    private  ClothFactory clothFactory;//用被代理类对象进行实例化

    public PloxyClothFactory(ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void produceCloth() {

        System.out.println("代理工厂做一些准备工作");

        clothFactory.produceCloth();

        System.out.println("代理工厂做一些收尾工作");
    }
}
