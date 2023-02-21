package ch05;
// 하나의 파일에 여러개 클래스를 쓸때는 public class 는 하나만 존재
class Cal{
	int x, y;//전역변수(=멤버변수) 여러 곳에서도 사용 가능
	public void prn() {
		String title = "연산결과"; //지역변수 --> 'prn' 이라는 메서드에서만 사용가능
		System.out.println(title);
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
		System.out.printf("%d / %d = %d\n", x, y, x/y);
		
	}
	
}
// 여러개 있을 떄 main 메서드를 포함한 클래스가 public class
public class CalEx {
	
	public static void main(String[] args) {
		Cal cal1 = new Cal();
		Cal cal2 = new Cal();
		
		cal1.x = 12; cal1.y = 4;
		cal2.x = 10; cal2.y = 4;
		cal1.prn();
		cal2.prn();
	}

}
