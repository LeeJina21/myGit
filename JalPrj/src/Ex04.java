
public class Ex04 {

	public static void main(String[] args) {
		char a, b, c, d, e;
		
		a = 'A'; // ���� a���� ���� ���� �������� 65
		System.out.printf("%c \t", a);
		System.out.printf("%d \n", (int)a);
		System.out.println("a��" + a +" | a�� ���ڰ���  " + (int)a);
		
		b = 'a'; // a�� �������� 97�̴� b���� 97�� ����ȴ� 
		c = (char) (b+1); // �׷��Ƿ� 97 +1
		System.out.println("b��" + b + " | b��  ���ڰ��� " + (int)b);
		System.out.println("c��" + c + " | c��  ���ڰ��� " + (int)c);
		
		d = 90;
		System.out.println("d�� " + d);
		
		d = '��'; // 44032
		e = (char)(d+1); // 44033
		System.out.println("d�� " + (int)d + " | d��  ���ڰ��� " + (int)d);
		System.out.println("e�� " + e + " | e��  ���ڰ��� " + (int)e);
	}

}
