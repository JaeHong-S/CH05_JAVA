package ch05;

public class Box {
	int height; int width; int depth;

	void volume() {
		System.out.printf("부피는 %d * %d * %d  = %d", height, width, depth, height*width*depth);
	}

}
