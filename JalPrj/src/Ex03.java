
public class Ex03 {

	public static void main(String[] args) {
		int a, b, c, d;

		a = 100 + 100;
		b = a + 100;
		c = a + b - 100;
		d = a + b + c;

		System.out.println("a의 값 : "+ a);
		System.out.println("b의 값 : "+ b);
		System.out.println("c의 값 : "+ c);
		System.out.println("d의 값 : "+ d +"\n");
		
		
		a = b = c = d = 100;
		
		System.out.println("a의 값 : "+ a);
		System.out.println("b의 값 : "+ b);
		System.out.println("c의 값 : "+ c);
		System.out.println("d의 값 : "+ d + "\n");
		
		a = 100;
		a = a + 200;
		System.out.println("a : "+a);
	}

}
