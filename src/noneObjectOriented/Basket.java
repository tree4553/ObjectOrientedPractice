package noneObjectOriented;

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
        apple.printApple();
        mango.printMango();
        grape.printGrape();
    }

    public void printTotalPrice() {
        int totalPrice = 0;
        totalPrice += apple.price + mango.price + grape.price;
        System.out.printf("총 가격 : %d원", totalPrice);
    }
}
