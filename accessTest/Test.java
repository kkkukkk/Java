package accessTest;

public class Test {
	private int pri;
	int def; // �����ϸ� default
	protected int pro;
	public int pub;
	
	private void prif() {
		System.out.println("private�޼ҵ�");
	}
	
	void deff() {
		System.out.println("default�޼ҵ�");
	}
	
	protected void prof() {
		System.out.println("protected �޼ҵ�");
	}
	
	public void pubf() {
		System.out.println("public �޼ҵ�");
	}
	public void test() {
		// private, default, protected, public ��� ���� Ŭ���� �������� ����(���) ����
		this.prif();
		this.deff();
		this.prof();
		this.pubf();
		System.out.println(this.pri);
		System.out.println(this.def);
		System.out.println(this.pro);
		System.out.println(this.pub);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
