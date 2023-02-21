package ch05;
import magic.Plus; //import : 다른 패키지의 class 사용하겠다.
public class PlusEx {
	public static void main(String[] args) {
//		magic.Plus p1 = new magic.Plus();  ch05 패키지 에서, magic패키지 안에 있는 Plus 클래스의 객체를 만들고 싶다면 방법1
		Plus p1 = new Plus();
		p1.x = 10; p1.y = 20;
		p1.add();
	}

}
