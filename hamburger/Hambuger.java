package hamburger;

import java.util.Scanner;

public class Hambuger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String CODE = "0000";//�ʱ� �������ڵ�

		int hamCnt = 0; // �ܹ��� ������ ������ ����
		int gamCnt = 0; // ����Ƣ�� ������ ������ ����
		int colaCnt = 0;// �ݶ� ������ ������ ����

		System.out.println("�ڿ��� �Ϸ絵 ��������~!��\n");

		while (true) {
			System.out.println("�ھ������ �Ե������Դϴ١�\n");
			System.out.println("1.�ֹ��ϱ�");
			System.out.println("2.�����ϱ�");
			System.out.print("�Է� >> ");
//			int choice = sc.nextInt();
//			sc.nextLine();
			int choice = Integer.parseInt(sc.nextLine());

			if (choice == 1) {
				// �ֹ��ϱ�
				hamCnt = 0;// �����մ��� �ֹ��ϱ� ������
				gamCnt = 0;// �����մ��� �������� 0����
				colaCnt = 0;// �ʱ�ȭ ���ش�
				while (true) {
					System.out.println();
					System.out.println("-----�޴���-----");
					System.out.println("|1.�ܹ���\t: 2000��|");
					System.out.println("|2.����Ƣ��\t: 2500��|");
					System.out.println("|3.�ݶ�\t: 500��|");
					System.out.println("|4.�����ϱ�         |");
					System.out.println("�Է� >> ");
					choice = Integer.parseInt(sc.nextLine());
					// ��ٱ��Ͽ� ������ ���� ������ ���� ����ִ� ������ �����ֱ�!
					// ----��ٱ���----
					// �ܹ��� : 0��
					// ����Ƣ�� : 0��
					// �ݶ� : 0��

					if (choice == 1) {
						hamCnt++;
						System.out.println("�ܹ��� 1���� ��ٱ��Ͽ� �߰��Ǿ����ϴ�\n");
					} else if (choice == 2) {
						gamCnt++;
						System.out.println("����Ƣ�� 1���� ��ٱ��Ͽ� �߰��Ǿ����ϴ�\n");
					} else if (choice == 3) {
						colaCnt++;
						System.out.println("�ݶ� 1���� ��ٱ��Ͽ� �߰��Ǿ����ϴ�\n");
					} else if (choice == 4) {
						// �ѱݾ� : 20000��
						// �ݾ��Է� >> 25000
						// �����Ϸ�!, �ܵ��� 5000���Դϴ�
						int price = 2000 * hamCnt + 2500 * gamCnt + 500 * colaCnt;

						System.out.println("�� ������ " + price + "�� �Դϴ�");
						System.out.print("�ݾ��Է� >> ");
						int money = Integer.parseInt(sc.nextLine());
						int rest = money - price;

						if (rest > 0) {
							System.out.println("�����Ϸ�!, �ܵ��� " + rest + "�� �Դϴ�");
						} else {
							System.out.println("�ܾ��� �����մϴ�");
							System.out.println("�߰��ݾ� >> ");
							int don = Integer.parseInt(sc.nextLine());
							rest = rest + don;
							if (rest >= 0) {
								System.out.println("�����Ϸ�!, �ܵ��� " + rest + "�� �Դϴ�");
							}else {
								System.out.println("�ܾ��� �����մϴ�");
								System.out.println("�߰��ݾ� >> ");
								int don2 = Integer.parseInt(sc.nextLine());
								rest = rest + don2;
							}

							break;
						}

						break;

					} else {
						System.out.println("�߸��Է��߽��ϴ� �ֹ�ȭ������ �̵��մϴ�\n");
						continue;
					}
					System.out.println("----��ٱ���----");
					System.out.printf("�ܹ��� %d��\n", hamCnt);
					System.out.printf("����Ƣ�� %d��\n", gamCnt);
					System.out.printf("�ݶ� %d��\n", colaCnt);
					System.out.println("--------------");
					System.out.println();
				} // �ֹ� while�� �ݴ� �߰�ȣ

			} else if (choice == 2) {// �����ϱ�
				// ������ ��й�ȣ �����ϱ�
				System.out.println("��й�ȣ ������ ���� �� \"����\"�� �Է��Ͻÿ� >> ");
				String input = sc.nextLine();
				if (input.equals("����")) {
					System.out.println("������ ��й�ȣ �Է� >> ");
					CODE = sc.nextLine();
					System.out.println("��й�ȣ ������");
					continue;
				}

				System.out.println("������ �ڵ带 �Է��� �ּ���\n");
				System.out.print("�Է� >> ");
				String passward = sc.nextLine();

				if (passward.equals(CODE)) {
					System.out.println("�����Ϸ絵 ����߽��ϴ�~");
					break;
				}
				System.out.println("�߸� �Է��߽��ϴ� ����ȭ������ ���ư��ϴ�");
				System.out.println("--------------------------------\n");

			} else {
				// �߸��Է��Ѻκ�
				System.out.println("�߸� �Է��߽��ϴ� ����ȭ������ �̵��մϴ�");
				System.out.println("--------------------------------\n");
			} // if�� �ݴ� �߰�ȣ

			System.out.println();
		} // ���� while�� �ݴ� �߰�ȣ
	}

}
