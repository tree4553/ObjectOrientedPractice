package applyObjectOriented.fruits;

// 과일들의 공통점을 추상화하여 Fruit라는 과일 클래스 생성
public class Fruit {
    // 아무튼 캡슐화를 해줘서 안전하게 해주자
    private String name;
    private String color;
    private int price;


    public Fruit(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void myNameIs() {
        System.out.println("나는 과일입니다.");
    }

    // 색깔 출력 함수를 나중에 추가해도
    // 여기서만 추가해주면 과일들에서는
    // 구현을 안해도 가져다 쓸수있음 개꿀
    public void myColorIs() {
        System.out.printf("%s의 색깔은 %s 입니다.\n", name, color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
