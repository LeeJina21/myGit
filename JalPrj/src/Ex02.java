
public class Ex02 {

	public static void main(String[] args) {
		int a;
		float b;
		
		a = (int) 123.45f;   //위에 int로 선언한 a를 123.45f;명령어가 강제로 float로 저장함 / (int)는 a를 강제로 정수로 저장함
		b = 200;
		
		System.out.printf("a의 값 ==> %d \n", a);
		System.out.printf("b의 값 ==> %f \n", b);
		
		System.out.println("a의 값 ==> "+ a);
		System.out.println("b의 값 ==> "+ b);
		
	}

}
