package live_ApplyObjectOriented;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Fruit> fruitArray;

    public Basket(ArrayList<Fruit> fruitArray) {
        this.fruitArray = fruitArray;
    }

    public void printFruitsName() {
        for (int i = 0; i < fruitArray.size(); i++) {
            fruitArray.get(i).myNameIs();
        }
    }

    public void printFruitsTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < fruitArray.size(); i++) {
            totalPrice += fruitArray.get(i).getPrice();
        }
        System.out.printf("과일들의 총 가격은 : %d 원 입니다.\n", totalPrice);
    }

    // 색깔 출력 함수
    public void printFruitsColor() {
        for (int i = 0; i < fruitArray.size(); i++) {
            fruitArray.get(i).myColorIs();
        }
    }
}
