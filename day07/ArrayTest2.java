package day07;

import java.util.Iterator;

public class ArrayTest2 {
	public static void main(String[] args) {
		// �ڷ���[] �迭�� = {��,��,....};
		int[] ar1 = { 10, 20 }; // ���� ���� ���̴� ���
		int[] ar2 = { 10, 20 };
		int[] ar3 = { 10, 20 };
		int ar4[] = { 10, 20 };

		// �迭�� ũ�⸸ �����ϴ� ���
		// �ڷ���[] �迭�� = new �ڷ���[ũ��];
		int[] nums = new int[5]; // int Ÿ���� 5�� �� �� �ִ� ������ �޸𸮿� �Ҵ�

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]); // 0 ���� 5�� �� ����
			// String Ÿ���� ��� null���� 5�� �� (class�� �ʱ� ��)
		}

		
		
		// ���� for��
		String[] names = {"��ö��", "ȫ�浿", "�迵��", "�ڹڹ�"};
		for(String n : names) { // names�� ����ִ� ��ҵ��� n���� �޾ƿ�
			System.out.println(n);
		}
		System.out.println("----------------");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		
	}
}
