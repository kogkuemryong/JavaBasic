//  자료형의 종류
	//정수 (byte, short, int, long) 
    //실수 (float, double) 


package exam02;

public class useVariableNotation {
	public static void main(String[] args) {
		byte num1, num2; // 1) 메모리 할당 2) 1byte 로 할랑 3) 정수 데이타 - 같은 키워드 사용시 연속해서 사용
         // byte num2;
		
		//num1 = 250; 양수 127 , 음수 -128 까지만 저장 할 수 있기 때문에 ERROR
		num1 = 55; // 초기화 
		num2 = 15; // 초기화
		System.out.println(num1-num2);//55-15 = 40 을 출력해준다. 
		System.out.println(num1 + "-" + num2  + "=" + (num1-num2)); 
		// 변수에 따음표를 넣으면 x , 문자열화 시키므로 결합하여 하나의 문자열로 만들어준다. 
		// "num1-num2=" 문자열 + 정수 = 문자열화 하여 
		// "num1-num2=40"; 로 나타내게 된다. 하나의 문자열화 되어 출력한다. 
		
		int num3 = 512 ,num4 = 250; // 변수 선언 및 초기화 
		System.out.println(num3+"+"+num4+"="+(num3+num4));
		
		// 16진수(4bit씩 끊어서 계산: 0x숫자) / 8진수(3bit씩 끊어서 계산: 0숫자) 
		// 메모리에 어떻게 저장 되어 있을지 빠르게 계산해서 파악할 수 있다. 
		num3 = 0x15;  //=  21은 10진수의 형태이다. 16진법 사용 
		System.out.println(num3);
		
		//10진법 - 512 를 2진수로 나타내면 10000000000(2의 9승) 16진법으로 0x200 8진법 01000
        num3 = 0x200; // 16 진수 = 10진법 512
    	System.out.println(num3);
		num3 = 01000; // 8진수 = 10진법 512
		System.out.println(num3);
		 
		
		
		
		
		
		
		
		
		
		
	
		

		
	}

}
