package exam07;

public class ArithOp { // 산술연산자

	public static void main(String[] args) {
		int num1 = 20, num2 = 8;
		int resultInt ; 
		
		
		 // '+' 은 숫자,문자 둘다 더해준다. 
		 resultInt = num1 + num2;
		 System.out.println(num1 + "+" + num2+ "="+ resultInt); // 20+8=28
		 
		 resultInt = num1 - num2;
		 System.out.println(num1 + "-" + num2+ "="+ resultInt); // 20-8=12
		 
		 resultInt = num1 * num2;
		 System.out.println(num1 + "*" + num2+ "="+ resultInt); // 20*8=160
		 
		 // '/' int/int로 계산해주면 int의 값이 나온다. 결과값 = 2( 몫의 결과만 보여준다)
		 resultInt = num1 / num2;
		 System.out.println(num1 + "/" + num2+ "="+ resultInt); // 20/8=2
		 //% 나눴을 때 얻게 되는 나머지를 반환한다. 나머지 = 4
		 resultInt = num1 % num2;
		 System.out.println(num1 + "%" + num2+ "="+ resultInt); // 20%8=4
		 
		 double num3 = 7.8 , num4 = 3.2; 
		 double resultDouble; 
		 
		 resultDouble = num3 / num4; // 출력 : 7.8/3.2=2.4375
		 System.out.println(num3 + "/" + num4+ "="+ resultDouble);
		 
		 // 실수의 값 나눗셈에서 소수점까지 나왔기 때문에 나머지 계산은 의미 없다. 
		 // % 연산자 - 실수형에서 나머지 연산은 의미 없다. 
		 resultDouble = num3 % num4; // 출력 : 7.8%3.2=1.3999999999999995
		 System.out.println(num3 + "%" + num4+ "="+ resultDouble);
	
		
	}

}
