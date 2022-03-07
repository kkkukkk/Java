package day15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {
	public static void main(String[] args) {
		//1. ���� ��ü �����
		// ���� ��ΰ� ���ٸ� FileNotFoundException�� �߻��Ѵ�
		File f = new File("D:\\1400_java_bsy\\memo\\test.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			//2. ��Ʈ������
			fr = new FileReader(f);
			
			//3. ���� �����
			br = new BufferedReader(fr);
			
			//4. ���� �б�
			System.out.println(br.readLine());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//5. ���۴ݱ�
				if(br != null) br.close();
				//6. ��Ʈ�� �ݱ�
				if(fr != null) fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
