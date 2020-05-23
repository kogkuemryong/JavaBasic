package exam15;

public class CastingOperation {

	public static void main(String[] args) {
		char alphabet = 'A'; // 2byte 할당해서 저장 메모리상에는 65라는 유니코드로 저장되어있다. 
		int unicode; 
		
		// 명시적 형 변환
		unicode = (int)alphabet; // (int)는 생략해도 되지만 가독성을 높이기 위해서 하는 것 : 명시적 형 변환
		
		
		// 자동 형변환 
		// unicode(int,4byte), alphabet(char,2byte)
		// 자료형도 다르고, 메모리의 크기도 다르다. 원칙적으로는  error 나와야 하는데 왜 출력이 잘 될까?
		// 더 큰 용량에 저장해주는 것은 원데이터의 손실 없이 저장해주는데 문제가 없다. 
		// 이와 같이 자바 스스로 바꿔주는 것 = 자동형 변환 이라고 한다. 
		System.out.println(alphabet); // 출력 : A
		System.out.println(unicode); // 출력 : 65
		
		/*
		 * short unicode; unicode = alphabet; 
		 * 같은 2byte지만 short는 음/양수를 모두 가지고 있기 때문에 char의 값이 다르므로 error
		 */
		
		// 강제 형변환 
		// int score1 = 23.5;  int = double 은 불가능!  데이터가 손실된다. 
		//소수점 이하를 버리고 정수의 값만 취해서 int에 넣으려고 한다면?? 
		int score1 = (int)23.5; // 자료형을 int로 강제로 변환 시킨것이다. 
		System.out.println(score1); // 23
		
		double num = 23.5;
		int score = (int)num; // 강제형변환이 되었다고 해서 num의 값이 바뀌는 것이 아니다.
		                                 // 실수형을 알아서 정수형을 바꿔서 출력해준다. 
		System.out.println(score); // 23
		System.out.println(num); // 23.5
		
		
		//int sum = 0.5 + 10;  error :  int sum = 0.5(double) + 10(double)자동 형변환;
		                               //  int sum = 10.5(double); 
		                               //  int 의 형태로 double이 형변환이 되지 않기 때문에 error 
		// 해결점 1) double sum = 0.5 + 10;
		// 해결점 2) int sum = (int)(0.5+10);
		
		float result = (float)(0.5+10); 
		System.out.println(result);
		
		char ch1 = 'A';
		char ch2 = 'Z';
		
		int num1 = ch1;
		int num2 = ch2;
		
		System.out.println("문자 A의 유니코드 값:"+ num1);
		System.out.println("문자 Z의 유니코드 값:"+ num2);
		
		int num3 = 0xC1A; // 16진법에서 10부터 a~f 까지 이다. 
		int num4 = 0215;
		
		double e1 = 1.3e-2;
		double e2 = 1.3e+2;
		
		System.out.println(num3);
		System.out.println(num4);
		
		System.out.println(e1);
		System.out.println(e2);
		
		
		long n1 = 1000000000000L;
		long n2 = 100;
		
		double q1 = 8.625;
		float q2 = 8.625f;
		
		
		
		

	}

}
