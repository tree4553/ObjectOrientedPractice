package live_NoneObjectOriented;

public class Basket {
    Apple apple;
    Mango mango;
    Grape grape;
    // 키위 추가
    Kiwi kiwi;

    public void printFruitsName() {
        apple.iAmApple();
        mango.iAmMango();
        grape.iAmGrape();
        kiwi.iAmKiwi();
    }

    public void printTotalPrice() {
        int totalPrice = 0;
        totalPrice += apple.getPrice() + mango.price + grape.price + kiwi.price;
        System.out.printf("바구니에 담긴 과일들의 총 가격 합은 : %d 원 입니다.\n", totalPrice);
    }

    public void printFruitsColor() {
        apple.appleColor();
        mango.mangoColor();
        grape.grapeColor();
        kiwi.kiwiColor();
    }
}
