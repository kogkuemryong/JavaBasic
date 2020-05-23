package exam03;

public class NoticeByteType {

	public static void main(String[] args) {
		byte data1 = 20 , data2 =30;
		//byte result;-- x
		int result;
		
		// 2진법으로 연산했을 때 : data1 = 00010100 +  data2 = 00011110 = 00110010 =50
		
		//byte result; -- result = data1 + data2; // -- ERROR(연산을 할 때)
		/*효율적으로 설계하기 위해서는 long 형을 제외하고는  
		byte / short / int 는 int 로 잡아서 연산의 결과를 도출한다. 
		Byte 로 선언했지만 내부에서 int 로 잡아서 계산하고 있기 때문에 
		Int(2byte) + Int(2byte) 의 값은  = 4byte의 값인데, 
		byte 안에 값을 넣으려고 하니 데이터의 손실이 발생함있으므로 java가 오류를 일으키는 것이다.*/ 
		// 연산을 수행하는 목적이 아닐 때 굳이 int 로 담을 필요 없다. 연산시에만 주의한다. 
		
		result = data1 + data2;
		System.out.println(data1+"+"+data2+"="+result);
		System.out.println(data1+"+"+data2+"="+( data1 + data2));
		
		
		

	}

}
