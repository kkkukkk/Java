package day07;

public class ArrayTask {
	public static void main(String[] args) {
		int[] ar = { 1, 5, 6, 7, 10 };
		// �迭�� ���ó�� �迭�� ��Ҹ� ����ϱ�
		// ��� ���� : {1,5,6,7,10}
		System.out.print("{");
		for (int i = 0; i < ar.length; i++) {
			// ���� i�� ������ �ε�����ȣ��� ", "�� ����ϸ� �ȵǰ�
			// ������ �ε����� �ƴ϶�� ", "�� ����ؾ��Ѵ�
			if (i == ar.length - 1) {
				System.out.print(ar[i]);
			} else {
				System.out.print(ar[i] + ", ");
			}
		}
		System.out.println("}");

		// ar���� ¦����° �ε����� �����ϴ� ��Ҹ� 100���� �ٲ��ֱ�
		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 0) {
				ar[i] = 100;
			}
		}
		System.out.print("{");
		for (int i = 0; i < ar.length; i++) {
			if (i == ar.length - 1) {
				System.out.print(ar[i]);
			} else {
				System.out.print(ar[i] + ", ");
			}
		}
		System.out.print("}");
	}
}
