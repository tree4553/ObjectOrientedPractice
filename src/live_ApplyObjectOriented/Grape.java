package live_ApplyObjectOriented;

public class Grape extends Fruit{
    public Grape(String name, String color, int price) {
        super(name, color, price);
    }

    public void myNameIs() {
        System.out.printf("내 이름은 %s야. 포동포동해\n", super.getName());
    }
}
