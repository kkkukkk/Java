package day03;

public class CastingTest {
	public static void main(String[] args) {
		System.out.println((int)3.14); // double --> int
		System.out.println((double)5); // int --> double
		System.out.println((char)65); // int --> char
		
//		String�� Ŭ�����̱� ������ �޼ҵ�� �ڷ����� �ٲ�����Ѵ�
		// String --> int
		// parseInt() �޼ҵ�, Integer Ŭ������ ��������ִ�
		// Integer.parseInt(), .�� �ȿ� �ִٴ� �ǹ�
		// Integer.parseInt("10") --> 10
		int num = Integer.parseInt("10");
		// int --> String
		// toString() �޼ҵ�, Integer Ŭ������ ��������ִ�
		String num2 = Integer.toString(10);
		System.out.println(num2 + 7);
		
		//System.out.println(Integer.parseInt("10"));
		
		// String --> double
		// parseDouble() �޼ҵ�, Double Ŭ������ ��������ִ�
		double d = Double.parseDouble("3.14");
		
		// double --> String
		// toString() �޼ҵ�, Double Ŭ������ ��������ִ�
		String d2 = Double.toString(5.154);
		
		//�Ϲ��� ����ȯ
		//�������� Ȱ���ϴ� ���
		System.out.println(10 * 1.0);
		String res = 10 + ""; // ���ڸ� ���ڿ��� �ٲ� �� ���� ���̴� ���
		
		double var2 = 10; // 10�� 10.0���� �ڵ� ����ȯ�� �ǰ�, ����ȴ�.
//		int var = 10.5
		
		char target = 't';
		// target�� ��� �ҹ��ڸ� �빮�ڷ� �����Ͽ� ����϶�
		// hint) �ƽ�Ű�ڵ�ǥ ����, �������, ����ȯ
		
		/*int target2 = target - 32;
		System.out.println((char)target2);*/
		
		System.out.println((char)(target-32));
		
		
		
	}

}
