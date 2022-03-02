package objectTest;

import java.util.Iterator;
import java.util.Scanner;

public class StringTest {
	// �츮���� ���� �޼ҵ� �����
	public static String join(String s, String[] ar) {
		String res = "";
		for (int i = 0; i < ar.length; i++) {
			if (i == ar.length - 1) {
				res += ar[i];
				break;
			}
			res += ar[i] + s;
		}
		return res;
	}

	public static void main(String[] args) {
		// length() : ���ڿ��� ���̸� return �Ѵ�
		System.out.println("apple".length());

		// charAt(idx) : �ش� ���ڿ����� �ε�����ȣ�� �ش��ϴ� char�� return�Ѵ�
		System.out.println("apple".charAt(0));

		// ����ڿ��� ����� �� ���ڿ��� �Է¹޾Ƽ�
		// �빮�ڸ� �ҹ��ڷ�, �ҹ��ڸ� �빮�ڷ� �ٲپ� ����Ͻÿ�

		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڿ� �Է� >> ");
		String abc = "ddd";
		String res = "";

		for (int i = 0; i < abc.length(); i++) {
			char c = abc.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				res += (char) (c + 32);
			} else if (c >= 'a' && c <= 'z') {
				res += (char) (c - 32);
			} else {
				res += c;
			}
		}
		System.out.println(res);

		System.out.println("---------------------");
//		indexOf(����) : �ش� ���ڿ����� �ش� ������ index��ȣ�� return

		// �ݺ��Ǵ� ������ ��� ���� ���� �ε����� return�Ѵ�.
		System.out.println("apple juice".indexOf('e'));

		// ã�� ������ �ε��� ��ȣ�� ������ �� �ִ�
		System.out.println("apple juice".indexOf('e', 5));

		// ���� ������ ��� -1�� return
		System.out.println("apple juice".indexOf('f'));

		// ���ڿ��� ��� ����, �� ���ں���
		System.out.println("apple juice".indexOf("ui"));

		// ����ڿ��� ���ڿ��� �Է� �޾Ƽ�
		// �ι�° o �� ��ġ �ε����� ����϶�

		System.out.println("���ڿ� �Է�");
		String input = "aaoaaap3o90";
		System.out.println(input.indexOf('o', input.indexOf('o') + 1));

		// substring(�����ε���) : ���� �ε������� ���ڿ��� �߶󳻴� �޼ҵ�
		System.out.println("�ȳ��ϼ���ݰ����ϴ�.".substring(4));

		// substring(�����ε���, ���ε���) : �����ε������� ���ε���-1 ���� ���ڿ��� �߶󳻴� �޼ҵ�
		System.out.println("�ȳ��ϼ���ݰ����ϴ�.".substring(4, 6));

		// ����ڿ��� ���ڿ��� �Է¹޾Ƽ� o ���� ������ �߶󳻱�
		input = "dadfoasdfadf";
		System.out.println(input.substring(input.indexOf('o')));

		// split(���ڿ�) : ��ȣ �� ���ڿ��� �������� �ɰ� String[]�� return
		String[] ar = "apple juice is delicious".split("e");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		// join(���ڿ�, �迭) : static �޼ҵ�
		// String.join()
		System.out.println(String.join("!", ar));
		
		System.out.println(StringTest.join("!", ar));

	}
}
