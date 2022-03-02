package day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<String>();
		System.out.println(fruits);
		
		// add() : �� �߰�
		// Set�� ������ ����, �ߺ��� ������� �ʴ´�
		fruits.add("���");
		fruits.add("�ٳ���");
		fruits.add("���ξ���");
		fruits.add("����");
		fruits.add("����");
		fruits.add("����");
		fruits.add("����");
		fruits.add("����");

		System.out.println(fruits);
		
		// remove() : ��� ����
		fruits.remove("���");
		System.out.println(fruits);
		
		// size() : ũ��
		System.out.println(fruits.size());
		
		// isEmpty() : ����ִٸ� true, �ƴϸ� false�� return
		System.out.println(fruits.isEmpty());
		
		
		// ��Ʈ�� �ݺ����� Ȱ���ؾ����� ���� �� ���� ������ �� �ִ�
		for( String element : fruits) {
			System.out.println(element);
		}
		
		System.out.println("-------------------");
		
		// iterator() : ������ �ο����ִ� �޼ҵ�
		// int num = Integer.parseInt("10");
		Iterator<String> iter = fruits.iterator();
		
		// hasNext() : ���� ��Ұ� ������ true, ������ false�� return
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.hasNext());
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		Iterator<Integer> it = nums.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
	}
}
