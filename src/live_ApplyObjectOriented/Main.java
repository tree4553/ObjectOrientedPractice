package live_ApplyObjectOriented;

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
        basket.printFruitsName();
        basket.printFruitsTotalPrice();

        // 색깔 출력 함수 추가
        basket.printFruitsColor();
        System.out.println();

        // 우와 짱편하당.
        // 다른 함수들도 이런시그올 편하게 추가할수 있다.
        Kiwi kiwi = new Kiwi("키위", "초록", 500);
        fruitArrayList.add(kiwi);
        // 개짱편하다
        // 객체지향 짱짱맨!!!
        // 굳굳~
        basket.printFruitsName();
        basket.printFruitsTotalPrice();
        basket.printFruitsColor();
    }
}
