package ch05;
class Car4{
	String CarNo;	//차량번호
	int inTime;		//입고시간
	int outTime;	//출고시간
	int fee;		//주차요금
	final int MONEY_PER_HOUR = 3000;  //시간당 주차요금
//	생성자 cno, in, out 을 입력받고
//	calFee (출고 - 입고) * 시간단가
//	차량번호, 입고시간, 출고시간, 주차요금 print
	
	void calFee() {
		 fee = (outTime - inTime) * MONEY_PER_HOUR;
	}
	Car4(String cno, int in, int out){
		CarNo = cno; inTime = in; outTime = out;
	}
	void prn() {
		System.out.println("차량번호 : " + CarNo);
		System.out.println("입고시간: " + inTime + "시");
		System.out.println("출고시간 : " + outTime +"시");
		System.out.println("주차요금 : " + fee + "원");
		System.out.println("------------------");
	}
}

public class Car4Ex {
	public static void main(String[] args) {
//		"가 1234", 10, 13
//		"나 3456", 9, 18
//		"다 6789", 11, 16
		Car4 c1 = new Car4("가 1234", 10, 13);
		Car4 c2 = new Car4("나 3456", 9, 18);
		Car4 c3 = new Car4("다 6789", 11, 16);
		/*Car4[] c = {c1, c2, c3};
		for (Car4 car : c) {
			car.calFee(); car.prn();*/
		
		c1.calFee();
		c2.calFee();
		c3.calFee();
		c1.prn();
		c2.prn();
		c3.prn();
		

	}
}
