package day14;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		
		System.out.println(scores);
	
		// put() �߰�
		scores.put("����", 80);
		scores.put("����", 70);
		scores.put("����", 100);
		scores.put("����", 100);
		System.out.println(scores);
		
		// size() : ����� ������ return
		System.out.println(scores.size());
		
		// isEmpty() : ����ִٸ� true, �ƴϸ� false
		System.out.println(scores.isEmpty());
		
		// get(key) : key�� �ش��ϴ� value�� return
		System.out.println(scores.get("����"));
		
		// remove(key) : ����
		scores.remove("����");
		System.out.println(scores);
		
		// keySet() : key ������ ����ִ� Set�� ���ϵȴ�
		System.out.println(scores.keySet());
		
		// values() : value ������ ����ִ� Collection�� return�ȴ�
		System.out.println(scores.values());
		
		// entrySet() : Entry ��ü�� ����ִ� Set�� return
		System.out.println(scores.entrySet());
		
		
		for(String k : scores.keySet()) {
			System.out.println(k + scores.get(k));
		}
		
		for(Entry<String, Integer> e: scores.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		HashMap<Integer, HashMap<String,String>> info = new HashMap<>();
		
		HashMap<String,String> s1 = new HashMap<String, String>();
		s1.put("�̸�", "��ö��");
		s1.put("����", "20");
		s1.put("�а�", "IT");
		info.put(202001, s1);
		
		HashMap<String,String> s2 = new HashMap<String, String>();
		s2.put("�̸�", "�ڿ���");
		s2.put("����", "25");
		s2.put("�а�", "��ǻ��");
		info.put(2017001, s2);
		
		System.out.println(info);
		
		System.out.println(info.get(2017001).get("�а�"));
		
		s2.put("�а�", "IT");
		info.put(2017001, s2);
		System.out.println(info);
		
	}
}
