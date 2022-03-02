package day12;

public class BoxingUnboxing {
	public static void main(String[] args) {
		int i = 10;
		// boxing
		Integer wi = new Integer(i);
		// unboxing
		int ri = wi.intValue();
		
		double d = 3.14;
		// boxing
		Double wd = new Double(d);
		// unboxing
		double rd = wd.doubleValue();
		
		
		// 5���� ���ķ� auto boxing �� auto unboxing�� �����Ѵ�
		
		int num1 = 10;
		Integer num2 = new Integer(10);
		// num1�� ���� �ڽ� �� ���� Object Ÿ������ ��ĳ����
		System.out.println(num2.equals(num1));
		System.out.println(num1 == num2);
		
		// auto unboxing
		int num3 = new Integer(10);
		// auto boxing
		Integer num4 = 10;
		
		
				
	}
}
