package applyObjectOriented.fruits;

public class Apple extends Fruit{
    // Apple은 Fruit를 상속받아서 귀찮게 변수 선언 안해도 된당. 개이덕
    public Apple(String name, String color, int price) {
        super(name, color, price);
    }
    public void myNameIs() {
        System.out.println("나는 사과입니다. 빨개여");
    }
}
