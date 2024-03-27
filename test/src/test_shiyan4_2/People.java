package test_shiyan4_2;

/**
 * @author guoqing
 * @create 2024-03-07-12:15
 */
public class People implements SetAndGerWeight{
    private double weight;

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
