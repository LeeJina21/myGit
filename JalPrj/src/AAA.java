
public class AAA {

	public static void main(String[] args) {
		//�ڷ��� ����!!
		
		//������
		int dec = 10; //10
		int oct = 010; //8
		int hex = 0x10; //16
		int bin = 0b10; //2
		
		int num = 1000_000; //1000000 + ����ٴ� �� ���̳� �ڿ� ��ġ���� ���Ѵ�.
		// int num = 1000000; �����Ͱ� �ٸ��� ������ ��
		
		//�Ǽ���
		double num1 = 123.4; // 123.4 �ؿ��� 123.4��
		double num2 = 1.234E2;
		double nu = num1+num2;
		
		//float num1 = 123.4; ���� ��!
		float num3 = 123.4F; // �̷��� �ؾ� ���� ��������!
		
		//����
		boolean flag1 = false;
		boolean flag2 = 10>5;
		
		System.out.println("�ټ����� ���� "+dec +"/" + oct +"/" + hex+"/" + bin+"/"+num+"/" +"�� ���´�");
		System.out.println(num1+ " + " + num2 + " = " +nu +"�̴�");
		System.out.println(dec +">"+ "5�� " + flag2 +"��");
		
	}

}
