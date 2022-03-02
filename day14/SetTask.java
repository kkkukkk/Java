package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> names = new HashSet<String>();
		
		while(true) {
			System.out.print("�̸��� �Է� >> ");		
			String input = sc.nextLine();
			
			if(input.equals("����")) break;
			
			names.add(input);			
		}
		
		Iterator<String> i  = names.iterator();
		System.out.print("�ݿ��� ");
		while(i.hasNext()) {
			System.out.print("[" + i.next() + "]");
		}
		System.out.print(names.size() + "���� �̸��� �����մϴ�");
	}
}
