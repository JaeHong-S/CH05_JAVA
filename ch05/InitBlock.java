package ch05;
// 초기화블럭 : 메소드 없이 실행해야 할 경우
public class InitBlock {
	int[] k1 = new int[5];			// 객체(인스턴스)를 생성한 후 사용 가능
	static int[] k2 = new int[5];	// 클래스를 로딩하면 바로 사용 가능
	 { // 초기화 블럭, 객체(인스턴스)를 생성한 후 사용 가능, 객체를 생성할 때 마다 실행
		for(int i = 0; i < k1.length; i++) {
			k1[i] = (int)(Math.random()*20) + 1;
//			k2[i] = (int)(Math.random()*20) + 1; 에러는 아니지만 권장x
		}
	}
	 static{ // 정적 초기화 블럭, 클래스를 로딩하면 바로 사용 가능, 한번만 실행
			for(int i = 0; i < k2.length; i++) {
//				k1[i] = (int)(Math.random()*20) + 1; 에러
				k2[i] = (int)(Math.random()*20) + 1;
			}
			
	 }
}

	
