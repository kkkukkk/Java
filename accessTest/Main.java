package accessTest;

public class Main {
	public static void main(String[] args) {
		Test t = new Test();
//		t.pri = 10; private ������ �ٸ� Ŭ�������� ��� �Ұ�
		t.def = 10;
		t.pro = 10;
		t.pub = 10;
		
//		t.prif(); private �޼ҵ�� �ٸ� Ŭ�������� ��� �Ұ�
		t.deff();
		t.prof();
		t.pubf();
		
		
		Student kim = new Student();
//		kim.name = "��ö��";
		
		kim.setName("��ö��");
//		kim.kor = 90;
		kim.setKor(90);
		kim.setEng(70);
		kim.eng = 10000;
//		kim.kor = 10000;
		kim.setKor(10000);
//		System.out.println(kim.name);
		System.out.println(kim.getName() + "��");
//		System.out.println("���� : " + kim.kor);
		System.out.println("���� : " + kim.getKor());
		System.out.println("���� : " + kim.getEng());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
