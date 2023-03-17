package blogging_NoneObjectOriented;

public class Mango {
    private String name;
    private String color;
    private int price;

    public Mango(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
        if(price < 0) {
            this.price = 0;
        }
    }

    public void printMangoName() {
        System.out.printf("내 이름은 %s야!", name);
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

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        if(price < 0) {
            System.out.println("가격은 음수가 될 수 없습니다.");
            return;
        }

        this.price = price;
    }
}
