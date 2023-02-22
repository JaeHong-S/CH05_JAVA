package ch05;
class Card {
	static int width = 100; //카드 폭
	static int height = 250; // 카드 높이
	String kind; // 카드 무늬
	int number; // 숫자
	
	void prn() {
		System.out.println("카드 폭 : " + width);
		System.out.println("카드 높이 : " + height);
		System.out.println("카드 무늬 : " + kind);
		System.out.println("카드 숫자 : " + number);
		System.out.println("--------");
	}
}

public class CardEx {
	public static void main(String[] args) {
		Card c1 = new Card(); c1.kind = "스페이드";  c1.number = 7; 
		Card c2 = new Card(); c2.kind = "다이아몬드";  c2.number = 1;
		Card c3 = new Card(); c3.kind = "클로바";  c3.number = 10;
		c1.prn();
		c2.prn();
		c3.prn();
		
		
	}
	

}
