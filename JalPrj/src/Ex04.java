
public class Ex04 {

	public static void main(String[] args) {
		char a, b, c, d, e;
		
		a = 'A'; // 실제 a값에 들어가는 들어가는 정수값은 65
		System.out.printf("%c \t", a);
		System.out.printf("%d \n", (int)a);
		System.out.println("a는" + a +" | a의 숫자값은  " + (int)a);
		
		b = 'a'; // a의 실제값은 97이다 b값엔 97이 저장된다 
		c = (char) (b+1); // 그러므로 97 +1
		System.out.println("b는" + b + " | b의  숫자값은 " + (int)b);
		System.out.println("c는" + c + " | c의  숫자값은 " + (int)c);
		
		d = 90;
		System.out.println("d는 " + d);
		
		d = '가'; // 44032
		e = (char)(d+1); // 44033
		System.out.println("d는 " + (int)d + " | d의  숫자값은 " + (int)d);
		System.out.println("e는 " + e + " | e의  숫자값은 " + (int)e);
	}

}
