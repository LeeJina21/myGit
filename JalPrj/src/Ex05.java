import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		String name;
		int age;
		double height;
		String buffer;
		String intro;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.next();
		System.out.println("���̸� �Է��ϼ���");
		age = sc.nextInt();
		System.out.println("Ű�� �Է��ϼ���");
		height = sc.nextDouble();
		System.out.println("�ڱ�Ұ��� �Է��ϼ���");
		buffer = sc.nextLine();
		intro = sc.nextLine();
		
		System.out.println("�Էµ� �̸��� " + name + " ���̴� " + age + " Ű�� "+ height +"�Դϴ�.");
		System.out.println(intro);
	}

}
