package myException;

import java.util.Scanner;

public class MyExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�г��� �̸� >> ");
		String nick = sc.nextLine();
		
		Method m = new Method();
		m.setNick(nick);
	}
}
