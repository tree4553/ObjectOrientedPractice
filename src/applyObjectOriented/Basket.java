package applyObjectOriented;

import applyObjectOriented.fruits.Fruit;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Fruit> fruitArrayList = new ArrayList<>();

    public Basket(ArrayList<Fruit> fruitArrayList) {
        this.fruitArrayList = fruitArrayList;
    }

    public void printBasket() {
        for (int i = 0; i < fruitArrayList.size(); i++) {
            fruitArrayList.get(i).myNameIs();
        }
    }

    public void printTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < fruitArrayList.size(); i++) {
            totalPrice += fruitArrayList.get(i).getPrice();
        }
        System.out.printf("총 가격 : %d원\n", totalPrice);
    }

    // 나중에 추가된 과일들 과일 이름과 색깔 출력 함수
    public void printFruitsColor() {
        for (int i = 0; i < fruitArrayList.size(); i++) {
            fruitArrayList.get(i).myColorIs();
        }
    }
}
