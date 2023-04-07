package src;

public class Test01_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10, b=20;
		boolean flag=false;
		if(a>10) {
			System.out.println("a는 10보다 크다");
		}else {
			System.out.println("a는 10보다 크지 않다.");
		}
		
		if(a==10 && b>=20) {
			System.out.println("조건을 만족함");
		}else {
			System.out.println("조건을 만족하지 못함");
		}
		if(flag) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
		// swich문으로 변경해서 작성 해보자!
		switch (a)
		{
		case 10 :
			System.out.println("a는 10보다 크다");

			break;
		case 80:
			System.out.println("B");
			break;
		case 70:
			System.out.println("C");
			break;
		default:
			break;
		}
		
	}

}
