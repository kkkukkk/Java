package day13;

public class ThrowsTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		try {
			a.rest();
		} catch (InterruptedException e) {
			System.out.println("30�� �ڿ� �ٽ� �õ��ϼ���");
		}
	}
}
