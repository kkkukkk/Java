package accessTest;

public class Student {
	private String name;
	private int kor;
	int eng;
	
	
	// ���� : private ������ ���� �����ϴ� �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		if(kor >= 0 && kor <= 100) {			
			this.kor = kor;
		}
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	// ���� : private ������ ����ִ� ���� �ǵ����ִ� �޼ҵ�
	public String getName() {
		return this.name;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	
	
	
	
}

















