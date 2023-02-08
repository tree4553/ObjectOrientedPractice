package noneObjectOriented;

public class Apple {
    String name;
    String color;
    int price;

    public Apple(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void printApple() {
        System.out.println("나는 사과입니다. 빨개여");
    }
}
