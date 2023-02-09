package live_ApplyObjectOriented;

public class Apple extends Fruit{
    public Apple(String name, String color, int price) {
        super(name, color, price);
    }

    @Override
    public void myNameIs() {
        System.out.printf("내 이름은 %s야. 미안해..\n", super.getName());
    }
}
