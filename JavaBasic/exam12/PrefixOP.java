package exam12;

public class PrefixOP { // 증감연산자

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 0,  num3 = 0; 
		
		num2 = ++num1;  // 전위 증가 연산자 , num1 += 1; 1증가 시켜서 누적(저장)킨다. 
		System.out.println("num1:"+num1); // num1:8
		System.out.println("num2:"+num2); // num2:8
		
		/*
		 * num2 = num1++; // 후위 증가 연산자 , num1 += 1;  1증가 시켜서 누적(저장)시킨다. 
		 * System.out.println("num1:"+num1); //num1:8 
		 * System.out.println("num2:"+num2); //num2:7
		 */
		
		//num2 의 값이 다르다. why?
		
		num3 = --num1;  // 전위 감소 연산자 , num1 -= 1; 1감소 시켜서 누적(저장)킨다. 
		System.out.println("num1:"+num1); // num1:7
		System.out.println("num3:"+num3); // num3:7
		
		/*
		 * num3 = num1--; // 후위 감소 연산자 , num1 -= 1; 1감소 시켜서 누적(저장)킨다.
		 * System.out.println("num1:"+num1); // num1: 7
		 * System.out.println("num3:"+num3); // num3: 8
		 */		

		//num3 의 값이 다르다. why?
		
		

	}

}
