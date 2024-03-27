package agent_model_dynamic;

/**
 * @author guoqing
 * @create 2024-03-07-22:13
 * 被代理类
 */
public class SuperMan implements Human{


    @Override
    public String getBelief() {
        return "I believe I can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("I like eat "+food);
    }
}
