package ch05;

class Grade {
	int kor = 60, eng = 60, math = 60; // main 에서 변수 값을 전달 받지 못한다면 아래의 최초 초기화된 값을 사용
	
	void total() {//반환형 void = 비어있다 --> 반환할 것이 없다
		int tot = kor + eng + math;
		
		System.out.println("총점 : " + tot);
		System.out.println("=====================");
	}
//	prn() 국어, 영어, 수학
	void prn() {
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
	}
}
public class GradeEx {
	public static void main(String[] args) {
		Grade g1 = new Grade(); g1.eng = 99; g1.math = 77; // Grade class의 전역변수 kor의 초기값으로 계산
		Grade g2 = new Grade(); g2.kor = 90; g2.math = 80; // Grade class의 전역변수 eng의 초기값으로 계산
		
		g1.prn();
		g1.total();
		g2.prn();
		g2.total();
	}

}
