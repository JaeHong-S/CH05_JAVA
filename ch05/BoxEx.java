package ch05;

public class BoxEx {
	public static void main(String[] args) {
		
		Box box1 = new Box();
		Box box2 = new Box();
		
		box1.height = 10;
		box1.width = 15;
		box1.depth = 18;
		
		box2.height = 11;
		box2.width = 12;
		box2.depth = 15;
		
		box1.volume();
		System.out.println();
		box2.volume();
	}

}
