package collectionTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		int[] ar = {1,2,3};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		// <> �ȿ��� ������ ���� Ŭ����Ÿ���� ����� �Ѵ�.
		// ���� ������ ���� <> ���� ������ �����ϴ�.
//		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println(list);
		
		//�� �߰��ϱ�
		//add()
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		
		System.out.println(list);
		
		// add(�ε���, ���) : �ش� �ε����� ��Ҹ� �����Ѵ�.
		list.add(1, 100);
		System.out.println(list);
		
		// get(�ε���) : �ε����� ��ġ�� ���� return
		System.out.println(list.get(1));
		
		// remove(�ε���) : �ش� �ε����� ��Ҹ� ����
		list.remove(0);
		System.out.println(list);
		
		// size() : ����� ������ return
		System.out.println(list.size());
		
		// isEmpty() : ����ִٸ� true, �ƴϸ� false�� return
		System.out.println(list.isEmpty());

		System.out.println("--------------------");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("--------------------");
		
		
		for (int num : list) {
			System.out.println(num);
		}
		
		
		System.out.println("--------------------");
		
		
		// ArrayList�� ������ LinkedList�� �������� �߿����� �ʴ�.
		// List�� ���ٴ� ���� �߿��ϱ⿡ ���ʿ� List��� ����ϱ⵵ �Ѵ�.
		List<String> list2 = new ArrayList<String>();
		
		LinkedList<String> llist = new LinkedList<String>();
		
		llist.add("�ȳ�");
		System.out.println(llist);
		
		
		
		
		
	}
}
