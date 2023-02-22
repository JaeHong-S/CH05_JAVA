package ch05;

public class Box {//기본 생성자, 생성자가 없으면 컴파일 시 자동으로 생성자를 만들어 준다.
	int height; int width; int depth;

	void volume() {
		System.out.printf("부피는 %d * %d * %d  = %d", height, width, depth, height*width*depth);
	}

}
