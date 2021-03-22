import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		String name;
		int age;
		double height;
		String buffer;
		String intro;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		System.out.println("키를 입력하세요");
		height = sc.nextDouble();
		System.out.println("자기소개를 입력하세요");
		buffer = sc.nextLine();
		intro = sc.nextLine();
		
		System.out.println("입력된 이름은 " + name + " 나이는 " + age + " 키는 "+ height +"입니다.");
		System.out.println(intro);
	}

}
