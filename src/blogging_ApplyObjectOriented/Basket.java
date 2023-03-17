package blogging_ApplyObjectOriented;


public class Basket {
    Apple apple;
    Mango mango;
    Grape grape;

    public Basket(Apple apple, Mango mango, Grape grape) {
        this.apple = apple;
        this.mango = mango;
        this.grape = grape;
    }

    public void printBasket() {
        apple.printFruitName();
        mango.printFruitName();
        grape.printFruitName();
    }

    public void printTotalPrice() {
        int totalPrice = 0;
        totalPrice += apple.getPrice() + mango.getPrice() + grape.getPrice();
        System.out.printf("총 가격 : %d원", totalPrice);
    }
}
