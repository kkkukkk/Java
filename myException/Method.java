package myException;

public class Method {
	public void setNick(String nick) throws BadWordException{
		if(nick.equals("�ٺ�")) {
			throw new BadWordException("�ٺ���� �Էµ�");
		}
		if(nick.equals("��û��")) {
			throw new BadWordException("��û�̶�� �Էµ�");
		}
		System.out.println("����� �г����� "+nick+" �Դϴ�.");
	}
}
