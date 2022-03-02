package day06;

public class ForReview {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			// ù��° i : 0
			// �ι�° i : 1
			// ����° i : 2
			// ...
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		String star = "*";
		for (int i = 0; i < 5; i++) {
			System.out.println(star);
			star += "*"; // star = star + "*";
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = 4 - i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < 4 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		star = "*";
		for (int i = 0; i < 5; i++) {
			System.out.printf("%5s\n", star);
			star += "*";
		}

		// ������ 2�ܺ��� 9�ܱ��� ����ϱ�
		for (int dan = 2; dan <= 9; dan++) {
			
			System.out.println("----"+ dan +"��----");
			for (int i = 1; i <= 9; i++) {
				System.out.println( dan +" x " + i + " = " + dan * i);
			}
		}
	}
}
