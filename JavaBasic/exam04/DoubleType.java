package exam04;

public class DoubleType {
	public static void main(String[] args) {
		double data1 = 3.14, data2 =1.05;  // 변수 선언 & 초기화 (실수)
		
		System.out.println(data1-data2); // 값을 잘 보관하고 있다. 
		
		data1 = 2.24; // 변수의 재사용 
		data2 = 1.22; // 변수의 재사용 
		
		System.out.println(data1-data2);  // 결과 값: 1.0200000000000002(오차 발생) 
		//모든 실수 값은 수학적으로 표현할 수 없으므로 컴퓨터 상의 표현 방식으로도 표현할 수 없기 때문에 
		//표현 방법을 만들어서 메모리 상에 표현할 수 있도록 했다. 
		//그렇기 때문에 실수의 오차가 발생할 수 있다. 
		
		// e표기법 
		double e1 = 1.2e-3; // 1.2 * 1/10(3승)  :  1.2 * 1/10^3
		double e2 = 1.2e+3; // 1.2 * 10(3승)  : 1.2 * 10^3 - (+) 생략 가능
		
		System.out.println(e1); // 결과 값 : 0.0012
		System.out.println(e2); // 결과 값 : 1200.0
		
		
	}

}
