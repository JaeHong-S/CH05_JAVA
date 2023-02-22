package ch05;

import java.util.Scanner;

public class Final2 {
	public static void main(String[] args) {
//		코드는 더 길지만, 가독성이 더 좋다.
		final int TRIAGNLE = 1; 
		final int RECTANGLE = 2;
		final int CIRCLE = 3;
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("1, 2, 3 중에서 숫자를 입력하세요");
			num = sc.nextInt();
			if (num == TRIAGNLE) System.out.println("삼각형입니다.");
			else if (num == RECTANGLE) System.out.println("사각형입니다.");
			else if (num == CIRCLE) System.out.println("원입니다.");
			else System.out.println("1, 2, 3 중에서 입력하세요.");
		} while (num != 0);
		System.out.println("종료");
		sc.close();
	}

}
