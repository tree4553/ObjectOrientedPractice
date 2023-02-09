package live_ApplyObjectOriented;

public class Mango extends Fruit{
    public Mango(String name, String color, int price) {
        super(name, color, price);
    }

    public void myNameIs() {
        System.out.printf("내 이름은 %s야. 맹고맹고\n", super.getName());
    }
}
