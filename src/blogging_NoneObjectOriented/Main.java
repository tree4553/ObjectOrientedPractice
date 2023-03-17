package blogging_NoneObjectOriented;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("사과", "빨강", 1000);
        Mango mango = new Mango("망고", "노랑", 2000);
        Grape grape = new Grape("포도", "보라", 1500);
        Basket basket = new Basket(apple, mango, grape);

        basket.printBasket();
        basket.printTotalPrice();

        // 출력이 잘된다.

        // 그런데 각 과일들의 클래스를 열어보면 똑같은 변수들을 똑같이 선언하고 있다.
        // 그리고 과일의 색상을 출력하는 함수를 만들어보자
        // 각 과일 클래스들에 색상을 출력하는 함수를 하나 하나 추가해야한다.
        // 과일이 100종류 있으면 100번 함수를 추가해야 함

        // 캡슐화 뭐라 태클걸지
        // 아무튼 객체의 변수에 직접 접근해서 값 변경하면 안됨
        // 어쩔 무슨무슨 규칙 위반임
        // 그러니까 클래스의 인스턴스 변수 중 외부에 드러날 필요가 없는 아이들은
        // private 접근 제어자로 선언하고
        // getter를 써서 값을 받아오고 setter를 써서 값을 변경하자

        // 자, 이제 basket에 키위를 추가해보자.
        // 키위를 추가하려면
        // 1. 키위 클래스 생성
        // 2. Basket 클래스에 키위 클래스 변수 추가
        // 3. Basket 클래스의 printBasket 함수에 키위 내용 추가
        // 4. Basket 클래스의 printTotalPrice 함수에 키위 가격 추가

        // 키위를 하나 추가하려는데 Basket 클래스의 내용을 변경해야 한다!
        // 새로운 과일들을 추가할 때마다 매번 수정이 필요하다
    }
}
