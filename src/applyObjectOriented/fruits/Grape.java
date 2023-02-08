package applyObjectOriented.fruits;

public class Grape extends Fruit{
    // Grape는 Fruit를 상속받아서 귀찮게 변수 선언 안해도 된당. 개이덕
    public Grape(String name, String color, int price) {
        super(name, color, price);
    }

    public void myNameIs() {
        System.out.println("나는 포도랍니다. 포동포동해여");
    }
}
