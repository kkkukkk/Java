package day03;

public class PlusOperator {
	public static void main(String[] args) {
		System.out.println("---int + ?---");
		int num = 10 + 10;//Ÿ���� �˰� �־���� ������ �˸°� ����� �� �ִ�
		System.out.println(10 + 10); // int + int --> int
		System.out.println(10 + 1.5); // int + double --> double
		System.out.println(10 + 'a'); // int + char --> int (��ǻ�ʹ� ���ڸ� ������ �� ���ڷ� ���� �ƽ�Ű�ڵ�)
		System.out.println(10 + "�ȳ�"); // int + String --> String (java������ ����+���ڴ� �׳� ����Ǿ� ��µ�)
		
		System.out.println("---double + ?---");
		System.out.println(1.5 + 1.5); // double + double --> double
		System.out.println(1.0 + 1); // double + int --> double
		System.out.println(1.5 + 'a'); // double + char --> double
		System.out.println(1.5 + "�ȳ�"); // double + String --> String
		
		System.out.println("---char + ?---");
		System.out.println('a' + 10); // char + int --> int
		System.out.println('a' + 1.5); // char + double --> double
		System.out.println('a' + 'b'); // char + char --> int
		System.out.println('a' + "�ȳ�"); // char + String --> String]
		
		System.out.println("---String + ?---");
		System.out.println("�ȳ�" + 10); // String + int --> String
		System.out.println("�ȳ�" + 1.5); // String + double --> String
		System.out.println("�ȳ�" + 'a'); // String + char --> String
		System.out.println("�ȳ�" + "�ϼ���"); // String + String --> String
		
		String day = "10";
		System.out.println(day + 5);
		
		System.out.println(10 + "20" + 8);
		
		System.out.println(10 + 3 + 5 + "�ȳ�" + (10 + 2)); // 18�ȳ�12 ()�� ����ϸ� ���� ���
		
		System.out.println(10 + "" + 20);
		
		
	}
}
