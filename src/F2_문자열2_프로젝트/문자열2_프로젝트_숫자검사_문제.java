package F2_���ڿ�2_������Ʈ;

import java.util.Scanner;

public class ���ڿ�2_������Ʈ_���ڰ˻�_���� {

	public static void main(String[] args) {
		/*
		 * # ���ڿ� �� ���ڰ˻�
		 * ��) adklajsiod
		 * 	     ���ڸ� �ִ�.
		 * ��) 123123
		 *    ���ڸ� �ִ�.
		 * ��) dasd12312asd
		 *    ���ڿ� ���ڰ� �����ִ�.
		 */
		// �Է��� ���� ���ڰ� �ִ��� Ȯ��
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� : ");
		String text = scan.next();
		// ���̰� �Ź� �ٸ�
		String strNum = "0123456789";
		String strText = "abcdefghijklmnopqrstuvwxyz";
		int count = 0; 
		for(int i = 0; i < text.length(); i++) {
			char a = text.charAt(i);
			for(int j = 0; j < strNum.length(); j++) {
				char b = strNum.charAt(j);
				if(a == b) {
					System.out.println(a + " " + b);
					count += 1; // ��ü ���̿� ������ ���̸� ���ؼ� ������ ���� �ƴϸ� ���ڰ� ����
				}
			}
		}
		if(count == text.length()) {
			System.out.println("����");
		}else {
			System.out.println("���ڿ� ����");
		}
		
		
		
		
		
		

	}

}
