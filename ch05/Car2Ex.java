package ch05;

class Car2 {
	static String color;
	static String kind;//공통으로 사용 가능, 클래스 변수 --> 로딩할 때 실행 : Car2 class를 로딩할 때 
	int displacement; //객체를 생성해야 사용 가능, 인스턴스 변수
	void prn() {
		System.out.println("색깔 : " + color);
		System.out.println("종류 : " + kind);
		System.out.println("배기량 : " + displacement);
		System.out.println("============");
		
	}

}
public class Car2Ex {
	public static void main(String[] args) {
		Car2 c1 = new Car2(); Car2 c2 = new Car2();
		c1.color = "빨강"; c1.displacement = 1500; c1.kind = "벤츠";
		c2.color = "노랑"; c2.displacement = 2000; // kind는 static 변수 이기 떄문에, 인스턴스 c2에서 따로 설정을 하지 않아도 인스턴스 c1에서 설정한대로 출력됨
		c2.kind = "카이엔";// static 변수를 마지막으로 대입한 값대로 나머지도 바뀐다.
		c1.prn();
		c2.prn();
		
	}
}