package exam13;

public class IfBasic {

	public static void main(String[] args) {
		int num1 = 47 , num2 = 38; // 변수 선언 및 초기화
		int result = 0;
		 
		result  = (num1 * num1 * num2 * num2) / (num1 - num2);
		
		if (result>50000) {
			System.out.println("실행 결과 값이 50000 이상입니다." );
			System.out.println("결과값:"+result);
			System.out. println("결과 값 출력 후 프로그램 종료...");
		}
		
		// result>50000 값이 true 가 나오면 뒤의 조건을 수행한다. 
		
		if (result>500000) {
			System.out.println("실행 결과 값이 50000 이상입니다." );
			System.out.println("결과값:"+result);
		}
		
		System.out. println("프로그램 종료...");
		
		
		// 괄호 안에는 boolean 값만 올 수 있다. 
		// 괄호안에 true 값이 오면 조건을 계산하고(실행 O) ,false 가 나오면 조건들을 건너뛰게 된다(실행 X). 
		// 괄호안에 true or false 직접적으로 넣지 않고 
		// 비교연산자 또는 논리연산자를 넣어서 변수의 값을 컴퓨터가 계산하게 한다. (결과 값 : boolean)
		
		

	}

}
