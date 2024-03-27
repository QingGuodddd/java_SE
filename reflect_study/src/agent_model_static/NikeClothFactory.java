package agent_model_static;

/**
 * @author guoqing
 * @create 2024-03-07-21:55
 */
public class NikeClothFactory implements ClothFactory{


    @Override
    public void produceCloth() {
        System.out.println("Nike工厂生产了一批运动鞋");
    }


}
