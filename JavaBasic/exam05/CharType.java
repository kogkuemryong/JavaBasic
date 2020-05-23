package exam05;

public class CharType {
	public static void main(String[] args) {
		// char ^= Char (대소문자를 구별한다)
		char alphbet, hangeul;
		int unicode;
		
		// char : 하나의 문자 입력 : 하나의 글자를 넣을 때, 작은 따옴표를 넣어서 저장해준다. 2byte 할당 요청
		alphbet = 'A'; 
		System.out.println(alphbet);
		unicode = alphbet;
		System.out.println(unicode); // 65 라는 숫자에 'A' 라는 글자가 들어있다. 
		
		// A라는 문자를 메모리에 저장 하는 것이 아니라 테이블을 찾아가서 
		// A라는 문자의 정수 값을 읽어와서 변수 값의 메모리에 저장해주는 것이고, 
		// 그 값을 출력해 줌으로 A라는 문자가 출력된다. 
		
		hangeul = '한';
		unicode = hangeul;
		System.out.println(hangeul);
		System.out.println(unicode); // 54620의 자리에 '한'이라는 글자가 들어가 있다. 
		
		hangeul = '국';
		unicode = hangeul;
		System.out.println(hangeul);
		System.out.println(unicode);
		
		hangeul = 'ㄱ';
		unicode = hangeul;
		System.out.println(hangeul);
		System.out.println(unicode);		
		
		// 두 글자 이상의 문자를 저장할 수 있게 해주는 예약어 : String 
		String name = "홍길동"; 
		System.out.println(name);
		
		

		
		
	}

}


