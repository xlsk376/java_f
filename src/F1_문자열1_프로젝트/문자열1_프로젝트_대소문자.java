package F1_���ڿ�1_������Ʈ;

import java.util.Scanner;

public class ���ڿ�1_������Ʈ_��ҹ��� {

	public static void main(String[] args) {
		/*
		���̵�� ��й�ȣ �Է¹ް� �α������ 		
		����) ��, ���̵�� ��й�ȣ�� 
		1) �빮�ڷ� �Է��ϴ� , 
		2) �ҹ��ڷ� �Է��ϴ� , 
		3) ��� �Է��ϴ� ���� �νĵǾ���Ѵ�.		
		 */

		Scanner scan = new Scanner(System.in);
		
		String dbid = "q1w2e3r4";
		String dbpw = "r4e3w2q1";
		
		String str0 = "0123456789";
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String id = "Q1W2E3r4";
		boolean check = false;
		if(dbid.length() != id.length()) { // ���� ��
			check = true;
		}else {						
			for(int i = 0; i < dbid.length(); i++) {
				char dbc = dbid.charAt(i);		// id ���ڿ� ���� ���
				char idc = id.charAt(i);	    // �Է��� id ���ڿ� ���� ���
//				if(dbc == idc) {
//					System.out.println(dbc + " " + idc);
//				}
				if(dbc != idc) {	//���ڿ��� ���� ��ġ���� ������
//                  �����̸� �Ʒ��� �������� �ȵ�
					for(int j = 0; j < str0.length(); j++) {
						if(dbc == str0.charAt(j) ) { // ���ڰ� ������ Ȯ��
							check = true;
							System.out.println(dbc + " " + idc);
							break;
						}
					}
					//�����̸� ��ҹ��ڰ˻�
					for(int j = 0; j < str1.length(); j++) {
						if(str1.charAt(j) == dbc) { // ���� ���̵� �ҹ��� ��ġ�ϴ��� Ȯ��
							if(str2.charAt(j) != idc) { // �Է��� ���̵� �빮�� ��ġ ����
								check = true;
								System.out.println(dbc + " " + idc);
								System.out.println("+");
								break;
							}
						}else if(str2.charAt(j)== dbc) { // ���� ���̵� �빮�� ��ġ�ϴ��� Ȯ��
							if(str1.charAt(j) != idc) { // �Է��� ���̵� �ҹ��� ��ġ ����
								check = true;
								System.out.println(dbc + " " + idc);
								break;
							}
						}
					}
				}				
			}		
		}
		if(check == false) {
			System.out.println("��ġ");
		}else {
			System.out.println("����ġ");
		}
		

	}

}
