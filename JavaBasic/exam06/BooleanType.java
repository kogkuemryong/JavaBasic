package exam06;

public class BooleanType {

	public static void main(String[] args) {
		//비교 연산자 
		System.out.println(35 > 25); // 값 : true
		System.out.println(35 < 25); // 값 : false
		
		// true 와 false 메모리 상에 잘 보관하고 있다가 쓰고 싶을 때가 많다. 
		// boolean : 메모리 1byte 요청
		
		boolean bool1; 
		boolean bool2; 
		
		bool1 = 35 > 25; // true	
		bool2 = 35 < 25; // false 
		
		System.out.println(bool1);
		System.out.println(bool2);
		
	   // 변수에 담아 두면 언제든 필요할 때 사용할 수 있으므로 편리하다. 
	   // java의 기본 자료형 - 8가지 ( 대표 정수: int , 실수:  doulean , 문자: char, 참과 거짓: boolean) 
		
		
	}

}
