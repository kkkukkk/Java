package day10;

public class SleepTest {
	public static void main(String[] args) {
		// �� �� ���� ������ �����ִ� �޼ҵ�
		// Thread Ŭ���� �ȿ� �����ϴ� sleep(), ����ƽ �޼ҵ� 
		System.out.print("����");
		for(int i = 0; i<5 ; i++) {
			System.out.print("~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("������ �߻����� �� ����Ǵ� ����");
			}
			
		}
		System.out.println("����");
	}
}
