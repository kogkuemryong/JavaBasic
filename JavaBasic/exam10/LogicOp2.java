package exam10;

public class LogicOp2 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		boolean result;
		
		 // 비교연산자  + 논리연산자  
		result = (num1 == 10) && (num2 == 30);
		System.out.println((num1 == 10) && (num2 == 30));
		System.out.println(result);
		System.out.println((num1 == 10) + "&&" + (num2 == 30) + "=" + result);
		System.out.println("result:" + result);
		
		result = (num1 >= 10) || (num2 <= 30);
		System.out.println(result);
		System.out.println((num1 >= 10) + "||" + (num2 <= 30) + "=" + result);
		System.out.println("result:" + result);
		
		result = num1 >= 10 || num2 <= 30; // 가로를 풀어도 결과가 나온다. 
		//즉, 연산 순서가 존재하여 값을 출력할 수 있디. 
		
		//(          ) 를 해서 코드를 만들면 가독성도 좋고, 다른 사람들로 하여금 이해하기 쉽도록 할 수 있다. 
		
	}

}
