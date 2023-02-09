package live_NoneObjectOriented;

public class Apple {
    private String name;
    private String color;
    private int price;

    public Apple(String inputName, String inputColor, int inputPrice) {
        this.name = inputName;
        this.color = inputColor;
        this.price = inputPrice;
    }

    public String taste = "맛있다!!";

    public void iAmApple() {
        System.out.printf("나는 %s야.\n", name);
    }

    public void appleColor() {
        System.out.printf("%s의 색깔은 %s입니다.\n", name, color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("양파") == true) {
            return;
        }
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
        if(price < 0) {
            return;
        }
        this.price = price;
    }
}
