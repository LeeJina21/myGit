
public class AAA {

	public static void main(String[] args) {
		//자료형 연습!!
		
		//정수형
		int dec = 10; //10
		int oct = 010; //8
		int hex = 0x10; //16
		int bin = 0b10; //2
		
		int num = 1000_000; //1000000 + 언더바는 맨 앞이나 뒤에 위치하지 못한다.
		// int num = 1000000; 위에것과 다르게 에러가 뜸
		
		//실수형
		double num1 = 123.4; // 123.4 밑에도 123.4다
		double num2 = 1.234E2;
		double nu = num1+num2;
		
		//float num1 = 123.4; 에러 뜸!
		float num3 = 123.4F; // 이렇게 해야 형을 지정가능!
		
		//논리형
		boolean flag1 = false;
		boolean flag2 = 10>5;
		
		System.out.println("다섯개의 수는 "+dec +"/" + oct +"/" + hex+"/" + bin+"/"+num+"/" +"가 나온다");
		System.out.println(num1+ " + " + num2 + " = " +nu +"이다");
		System.out.println(dec +">"+ "5는 " + flag2 +"다");
		
	}

}
