package day05;

public class NestedFor {
	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {
			// System.out.println("�ٱ� for�� ����");
			for (int j = 0; j < 3; j++) {
				System.out.println("i : " + i + " j : " + j);
				// System.out.println("���� for�� ����");
			}
		}

		/*
		 * ***** ***** ***** ***** *****
		 */
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * * ** *** **** *****
		 * 
		 */

		/*
		 * * ** *** **** *****
		 * 
		 * 
		 */

		// ������ 2�ܺ��� 9�ܱ��� ����ϱ�
		int x = 2;
		int y = 9;
		
		for ( ; x < y+1; x++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(x + "x" + i + "=" + x * i);
			}
		}

	}
}
