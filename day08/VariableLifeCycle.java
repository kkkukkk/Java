package day08;

public class VariableLifeCycle {
	public static void change(int num) {
		num = 500;
		
	}
	
	
	public static void main(String[] args) {
		int num = 10; // �������� ������ ���θ޼ҵ� �ȿ����� ��� ����
		VariableLifeCycle.change(num);
		System.out.println(num);	
	}
	
	
}
