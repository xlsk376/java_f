package F3_���ڿ�3_�˰���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ���ڿ�3_�˰���_����Ÿ�� {

	public static void main(String[] args) {
		/*
		 * # Ÿ�ڿ��� ����[2�ܰ�]
		 * 1. ������ ���´�.(shuffle)
		 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
		 * 3. �� ������ ������ ��, �ܾ��� ������ ��ġ �� ���� *�� ���
		 * ��)
		 * ���� : mys*l
		 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
		 * ���� : *sp
		 * �Է� : jsp
		 * ...
		 */

		String[] words = { "java", "mysql", "jsp", "spring" };
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(words.length);
			int r2 = ran.nextInt(words.length);
			String temp = words[r1];
			words[r1] = words[r2];
			words[r2] = temp;
		}
		String temp1[] = new String[4];
		int index = 0;
		for(int i = 0; i < words.length; i++) {
			int count = 0;
			String temp= "";
			int r = ran.nextInt(words[i].length());
			for(int j = 0; j < words[i].length(); j++) {
				char a = words[i].charAt(j);
				if(r == j) {
					temp += "*";
					count +=1;
				}else {
					temp += a;
					count += 1;
				}
				if(count == words[i].length()) {
					temp1[index] = temp;
					index += 1;
				}
			}
		}
		for(int i = 0; i < temp1.length;) {
			System.out.println(temp1[i]);
			String text = scan.next();
			if(temp1[i].length() == text.length()) {
				boolean check = false;
				for(int j = 0; j < temp1[i].length(); j++) {
					char b = temp1[i].charAt(j);
					char c = text.charAt(j);
					if(b == c) {
						check = true;
					}
				}
				if(check == true) {
					System.out.println("����");
					i += 1;
				}else {
					System.out.println("��");
				}
			}else {
				System.out.println("��");
			}
		}
		
		
		

	}

}
