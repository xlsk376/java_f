package F1_���ڿ�1_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class ���ڿ�1_������Ʈ_Ÿ�ڿ��� {

	public static void main(String[] args) {
		/*
		 * # Ÿ�ڿ��� ����[1�ܰ�]
		 * 1. ������ ���´�.(shuffle)
		 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
		 * ��)
		 * ���� : mysql
		 * �Է� : mydb
		 * ���� : mysql
		 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
		 * ���� : jsp
		 */

		String[] words = { "java", "mysql", "jsp", "spring" };

//		for (String str : words) {
//			System.out.println(str);
//		}
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			int r1 = ran.nextInt(words.length);
			int r2 = ran.nextInt(words.length);
			String temp = words[r1];
			words[r1] = words[r2];
			words[r2] = temp;
		}
		int count = 0;
		for (String str : words) {
			System.out.println(str);
			if(count == 5) {
				break;
			}
			while(true) {
				String str1 = scan.next();
				if(str.length() == str1.length()) {
					boolean check = false;
					for(int i = 0; i < str.length(); i++) {
						char a = str.charAt(i);
						char b = str1.charAt(i);
						if(a != b) {
							check = true;
							break;
						}
					}
					if(check == false) {
						System.out.println("����");
						count += 1;
						break;
					}else {
						System.out.println("��");
					}
				}else {
					System.out.println("��");
				}
				
			}
			
		}
		
		

	}

}
