package live_ApplyObjectOriented;

public class Kiwi extends Fruit {
    public Kiwi(String name, String color, int price) {
        super(name, color, price);
    }

    public void myNameIs() {
        System.out.printf("내 이름은 %s야. 키위는 너무셔... 키위는 너무셔... 달..달다!!\n", super.getName());
    }
}
