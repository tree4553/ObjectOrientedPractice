package live_NoneObjectOriented;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("사과", "빨강", 1000);
        Mango mango = new Mango();
        Grape grape = new Grape();

        apple.setName("사과");
        mango.name = "망고";
        grape.name = "포도";

        //apple.setColor("빨강");
        // 과일 너무 ㅁ낳아
        // 망고 색깔 적는거 까먹음
        mango.color = "노랑";
        grape.color = "보라";

        apple.setPrice(1000);
        mango.price = 2000;
        grape.price = 1500;

        Basket basket = new Basket();
        basket.apple = apple;
        basket.mango = mango;
        basket.grape = grape;

        //basket.printFruitsName();
        //basket.printTotalPrice();

        // 각 과일의 색깔을 출력해주는 함수를 만들어보자.
        //basket.printFruitsColor();
        // 개불편하죠?
        // 각 클래스별로 함수를 선언해줘야되고
        // 과일 종류가 100개면 100번 해줘야되요

        // 키위 과일을 basket에 추가해보자.
        Kiwi kiwi = new Kiwi();
        kiwi.name = "키위";
        kiwi.color = "초록";
        kiwi.price = 500;

        basket.kiwi = kiwi;

        // 고양이가 변경함
        apple.setName("양파");
        apple.setPrice(-50000);

        System.out.println(apple.taste);

        basket.printFruitsName();
        basket.printTotalPrice();
        basket.printFruitsColor();
        // 키위 하나 추가하는데
        // 할게 너무 많네여.
        // 다른 과일 하나씩 추가할때마다
        // 죽어가는겁니다.

    }
}
