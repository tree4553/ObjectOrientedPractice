package live_ApplyObjectOriented;

public class Fruit {
    private String name;
    private String color;
    private int price;

    public Fruit(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void myNameIs() {
        System.out.println("나는 과일이야.");
    }

    // 색깔 출력 함수 추가
    public void myColorIs() {
        System.out.printf("%s의 색깔은 %s 입니다.\n", name, color);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
