package blogging_ApplyObjectOriented;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("사과", "빨강", 1000);
        Mango mango = new Mango("망고", "노랑", 2000);
        Grape grape = new Grape("포도", "보라", 1500);
        Basket basket = new Basket(apple, mango, grape);

        basket.printBasket();
        basket.printTotalPrice();
    }
}
