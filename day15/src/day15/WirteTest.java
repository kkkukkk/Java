package day15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WirteTest {
	public static void main(String[] args) {
		//1. ���� ��ü �����
		// ������ �ȿ��� ���� ����� ������ ��θ� ���ش�
		//"D:\\1400_java_bsy\\memo\\test.txt" : ������
		//"test.txt" : �����, ������Ʈ ������ �⺻��ġ�� �����Ǿ��ִ�
					// D:\\1400_java_bsy\\workspace\\day15
					// .. : ���� ������ �ǹ��Ѵ�
		
//		File f = new File("D:\\1400_java_bsy\\memo\\test.txt");
		File f = new File("..\\..\\memo\\test2.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//2. ��Ʈ�� ����
			// �����ڿ��� ����� ���� ��ü�� ���ش�
			// �����ڿ� true���� �ѱ�� ���� ���� ���ʿ� �����̱�
			// false�� �����̶�� ���� ���� ��ü�� ������Ѵ�
			fw = new FileWriter(f);
			//3. ���۸����
			// �����ڿ��� FileWriter ��ü�� ���ش�
			bw = new BufferedWriter(fw);
			
			//4. ���� ���
			bw.write("����ؼ� ������\n");
//			bw.newLine();
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//5. ���۴ݱ�
				if(bw != null) bw.close();
				//6. ��Ʈ�� �ݱ�
				if(fw != null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
			
			
		}
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
