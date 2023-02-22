package ch05;

public class InitBlk1Ex {
	public static void main(String[] args) {
		for(int i = 0; i < InitBlock.k2.length; i++) {
			System.out.println("k2 [" + i + "] = " + InitBlock.k2[i]);
		}
		
		
		
		System.out.println("================");
		InitBlock ib1 = new InitBlock();
		for(int i = 0; i < ib1.k1.length; i++) {
			System.out.println("k1 [" + i + "] = " + ib1.k1[i]);
		}
	}
}
