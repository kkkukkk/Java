package constrcutorTest;

public class Main {
	public static void main(String[] args) {
		Student s = new Student("��ö��", 10, "�ʵ��б�");
		Student s2 = new Student();
		
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.school);
		
		
	}
}
