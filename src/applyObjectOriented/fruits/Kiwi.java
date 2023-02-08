package applyObjectOriented.fruits;

public class Kiwi extends Fruit{
    public Kiwi(String name, String color, int price) {
        super(name, color, price);
    }

    public void myNameIs() {
        System.out.println("키위는 너무 셔! ... 달다");
    }
}
