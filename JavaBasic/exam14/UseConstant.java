package exam14;

public class UseConstant {
	public static void main(String[] args) {
		
		//상수가 메모리에 저장되어질 때의 문제점 
		
				// int num = 3000000000; int의 범위를 넘어서서 error 가 일어난다. 
				//long num = 3000000000; -- error
				long num = 3000000000L; 
				/*
				 * long을 보고 8byte 메모리를 할당해주지만 상수는 기본적으로 
				 * int의 형태로 저장되어지기 때문에 30억이라는 수가 int의 범위를
				 * 넘어서서 error 를 일으킨다.
				 * 문제를 해결하기 위해서는 상수의 값을 long의 값으로 할당해준다. 상수의 뒤에 (L,l) 을 넣어준다. 
				 */
				
				
				/*
				 * float pi = 3.14 ; 
				 * -- error 실수형 상수는 double으로 기본적으로 할당하기 때문에 
				 * -- 8byte 의 데이터를 4byte의 데이터 안에 넣으려고 하니깐 
				 * -- 데이터 손실 할수있기 때문에 error를 일으킨다. 
				 * -- 해결점 : double 의 형태를 float 형으로 바꿔준다. 상수 뒤에(F,f)을 넣어준다. 
				 * -- 또는 입력 값을 double로 바꿔준다. 
				 */
				float pi = 3.14F; // double pi = 3.14



	}

}
