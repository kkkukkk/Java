package day10;

public class Car {
	String name;
	int price;
	String color;
	
	public Car() {
		System.out.println("Car ��ü ������");
	}
	
	public void go() {
		System.out.println("������ ���ϴ�.");	
	}
	
	public void engineOn() {
		System.out.println("����� �õ��� �׽��ϴ�.");
	}
	
	public void show() {
		System.out.println("----��������----");
		System.out.println("���� : " + this.name);
		System.out.println("���� : " + this.price +"����");
		System.out.println("���� : " + this.color);
	}
	
}
