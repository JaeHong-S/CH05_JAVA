package ch05;

public class Cal2Ex {
	int x, y, sum; //속성 변수
	Box box1; //참조변수
	void sum() {
		System.out.println("x = " +x+", y = " +y+ ", 합계 : "+(x+y));
		
	}
	public static void main(String[] args) {
		Cal2Ex c1 = new Cal2Ex(); c1.x = 10; c1.y =20;
		Cal2Ex c2 = new Cal2Ex(); c2.x = 12; c2.y = 7;
		c1.sum();
		c2.sum();
	}
	
}
