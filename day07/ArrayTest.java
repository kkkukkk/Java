package day07;

public class ArrayTest {
	public static void main(String[] args) {
		int[] ar = { 10, 20, 30, 40, 50, 60,5,13,5,1,3,2,2,5,6,1,3,2 };
		System.out.println(ar);
//		int num = ar[0];

		//length : �迭�� ��� ������ �˷��ش�.
		System.out.println("�迭 ��� ���� : " + ar.length);
		
		//���Կ����� �տ� ����ϸ� ���� ������ �� �ִ�.
		ar[0] = 100;
//		ar[0] = "�ȳ�"; int Ÿ���� ��Ұ� ����ִ� �迭�̱� ������ ����
		
		//�迭�� �ε����� 0���� �迭�� ��Ұ���-1
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]); �ε��� ������ ����� ������ �߻���
		
		// ���ڿ� Ÿ���� �迭
		String[] ar2 = {"�ȳ�", "�ݰ���", "������", "�����"};
		
		System.out.println(ar2[0]);
		// ar2 �ӿ��� ������ �̶�� ���ڿ��� ���° �ε����� �����ϴ��� ����ϱ�
		
		// 2��° �ε����� �����մϴ�!
		
		for (int i = 0; i < ar2.length; i++) {
			if (ar2[i].equals("������")) {
				System.out.println(i+"��° �ε����� �����մϴ�!");
			}
		}
		
	}

}
