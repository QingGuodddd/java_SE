package test_shiyan4_2;

/**
 * @author guoqing
 * @create 2024-03-07-12:25
 */
public class TrainTest {

    public static void main(String[] args) {
        Television television = new Television();
        television.setWeight(100);

        Computer computer = new Computer();
        computer.setWeight(200);

        WashMachine washMachine = new WashMachine();
        washMachine.setWeight(300);

        People people = new People();
        people.setWeight(50);

        Train train = new Train();
        train.addToTrain(0,television);
        train.addToTrain(1,computer);
        train.addToTrain(2,washMachine);
        train.addToTrain(3,people);

        System.out.println(train.sumWeight());


    }
}
