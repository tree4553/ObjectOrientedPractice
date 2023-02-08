package applyObjectOriented;

import applyObjectOriented.fruits.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple("사과", "빨강", 1000);
        Fruit mango = new Mango("망고", "노랑", 2000);
        Fruit grape = new Grape("포도", "보라", 1500);

        ArrayList<Fruit> fruitArrayList = new ArrayList<>();
        fruitArrayList.add(apple);
        fruitArrayList.add(mango);
        fruitArrayList.add(grape);

        Basket basket = new Basket(fruitArrayList);
        basket.printBasket();
        basket.printTotalPrice();
        System.out.println();

        // 바구니에 담긴 과일의 이름과 색깔을 출력하는 함수를 추가해서 실행시켜보자.
        basket.printFruitsColor();
        System.out.println();

        // 키위를 추가해보자.
        Fruit kiwi = new Kiwi("키위", "초록", 500);
        fruitArrayList.add(kiwi);
        basket.printBasket();
        basket.printTotalPrice();
        basket.printFruitsColor();
    }
}
