package exam11;

public class SCE { // Short-Circuit Evaluation

	public static void main(String[] args) {
		int num1 = 0, num2 =0; // 초기화
		boolean result = false; 
		
		// Short-Circuit Evaluation
		result = ((num1+=10)<0) && ((num2 +=10) >0); 
		// 가로를 없애버리면 원하는 피연산자로 연산이 되지 않는다. 
		System.out.println("결과:"+result);
		System.out.println("num1:"+num1); // num1:10
		System.out.println("num2:"+num2); // num2:0
		// (num1+=10)<0 : false 논리 연산자 && 는 앞의 코드가 false 이므로 결과는 false 이기 때문에
		// 뒤 코드는 수행하지 않고 바로 결과(false)를 반환해준다. 그렇기 때문에 num2 = 0 이라는 값이 출력된다. 
	
		//System.out.println(((num1+=10)<0)+"&&"+(((num2 +=10) >0))+"="+result);
		
		result = ((num1 +=10) > 0) || ((num2 +=10)<0);
		System.out.println("결과:"+result); // 결과:true
		System.out.println("num1:"+num1); // num1:20
		System.out.println("num2:"+num2); // num2:0
		// (num1 +=10) > 0:true 논리 연산자|| 는 앞의 코드가 true 이므로 결과가 true이기 때문에
		// 뒤 코드는 수행하지 않고 바로 결과(true)를 반환해준다. 그렇기 때문에 num2 = 0 이라는 값이 출력된다
		
	}

}
