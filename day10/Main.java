package day10;

public class Main {
	public static void main(String[] args) {
		Car momCar = new Car();
		System.out.println("=============");
		// �ڽ� Ÿ���� �����ڰ� ȣ��Ǹ� �켱 �θ� �����ڰ� ����
		// ȣ��ǰ�, �ڽ� �����ڰ� ȣ��ȴ�.
		SuperCar myCar = new SuperCar();

		// �ν��Ͻ� instanceof Ŭ���� : �ش� �ν��Ͻ��� Ŭ���� Ÿ���̸� true, �ƴϸ� false
		System.out.println(momCar instanceof Car);
		System.out.println(momCar instanceof SuperCar);
		System.out.println(myCar instanceof Car);
		System.out.println(myCar instanceof SuperCar);

		momCar.name = "����";
		momCar.price = 100;
		momCar.color = "�Ķ���";
//		momCar.mode = "normal";

		momCar.show();
		momCar.go();
		momCar.engineOn(); // �θ𿡼� ���ǵ� �޼ҵ尡 ���ȴ�.
//		momCar.openRoof(); �ڽ�Ŭ�������� ���Ӱ� ���ǵ� �޼ҵ�� �θ�Ŭ�������� ���Ұ�

		System.out.println("------------------------");

		myCar.name = "ȫ�浿";
		myCar.price = 1000;
		myCar.color = "������";
		myCar.mode = "sport";

		myCar.show();
		myCar.go();
//		myCar.engineOn2();
		myCar.engineOn(); // �ڽĿ��� �����ǵ� �޼ҵ尡 ���ȴ�.
		myCar.openRoof();
		System.out.println("--------------------------");
		// ��ĳ����
		// �θ� Ÿ�Կ� �ڽ� ���� �ִ� ����
		Car c = myCar; // ��ĳ����
		// ��ĳ���� �� ��� �ڽĿ��� ���Ӱ� ���ǵ� ����� ����� �Ұ����ϴ�

//		c.mode = "normal";
		c.go();
//		c.openRoof();
		c.engineOn(); // ���� �ڽĿ��� ������ �� �޼ҵ尡 �ִٸ� ����� �����ϴ�.
		// �����ǵ� ��� �����Ѵ�

//		SuperCar sc = momCar; momCar�� SuperCar Ÿ���� �ƴϹǷ�  �Ұ���
		// �θ�Ÿ���� ��ü�� �ڽ�Ÿ���� �ƴϱ� ������ �ڽ�Ÿ������ �־��� �� ����
		// �ٿ�ĳ���� : �ڽ��̾��µ� ��ĳ���� �� ��ü�� �ٽ� �ڽ����� ����������
		
		SuperCar s = (SuperCar)c;
		
		s.openRoof();
		
		//(int)3.14
//		int a = (int)3.14;
//		double b = 3;
		
		
		
		

	}
}
