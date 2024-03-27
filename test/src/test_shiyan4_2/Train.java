package test_shiyan4_2;

import java.util.ArrayList;

/**
 * @author guoqing
 * @create 2024-03-07-12:19
 */
public class Train {
    private ArrayList<SetAndGerWeight> setAndGerWeights = new ArrayList<>();

    public void addToTrain(int i,SetAndGerWeight saw)
    {
        setAndGerWeights.add(i,saw);
    }

    public double sumWeight()
    {
        double sumWeight = 0.0;
        for(SetAndGerWeight weights:setAndGerWeights)
        {
            sumWeight = sumWeight + weights.getWeight();
        }
        return sumWeight;
    }



}
