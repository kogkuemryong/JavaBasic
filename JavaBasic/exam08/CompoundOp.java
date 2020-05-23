//복합대입연산자 : 누적하겠다는 의미가 담겨있고 그것을 강조하기 위해서 사용한다.

package exam08;

public class CompoundOp { // 복합대입연상자

	public static void main(String[] args) {
        int num = 125;
		
		
		num += 50; // num = num+50;
		// 현재의 값에서 50을 더해서 누적하겠다는 의미가 담겨있고 그것을 강조하기 때문에 사용한다. 
		// 사이에 여백이 있으면 안된다. 
		System.out.println(num);
		
		num -= 50; // num = num-50; // 누적의 의미를 강조 
		System.out.println(num);
		
		num *= 50; // num = num*50; // 누적의 의미를 강조 
		System.out.println(num);
		
		num /= 50; // num = num/50;// 누적의 의미를 강조 
		System.out.println(num);
		
		num %= 50; // 누적의 의미를 강조 
		System.out.println(num);
		
	}

}
