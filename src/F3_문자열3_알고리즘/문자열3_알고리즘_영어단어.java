package F3_���ڿ�3_�˰���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ���ڿ�3_�˰���_����ܾ� {

	public static void main(String[] args) {
		// ����) ����ܾ� ���߱�
		// ����ܾ ���� * �� ǥ�õȴ�.
		// ����ܾ �Է¹ް� Ʋ�������� �������� �ѱ��ھ� ��������. (������ 5���� ����)
		// (����) ���࿡ ���� ö�ڰ� �������� �ѹ��� ��������.
		// ���� �������ų� ���߸� ����
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "����";
		int size = word.length();
		int check[] = new int[size]; // ��Ʈ üũ�� ���ؼ� Ȯ���Ҽ��ִ�.
		for(int i = 0; i < size; i++) {
			check[i] = word.charAt(i);
		}
		System.out.println(Arrays.toString(check));
		int temp[] = new int[size];
		while (true) {
			System.out.println("�� : " + meaning);
			System.out.print("���� : ");
			for (int i = 0; i < size; i++) {
				char hit = word.charAt(i);
				if(temp[i] == 0) {
					System.out.print("*");
				}else {
					System.out.print(hit);
				}
			}
			System.out.println();
			System.out.println("����ܾ �Է��ϼ��� >>> ");
			String me = scan.next();
			boolean tf = false;
			if(me.length() == word.length()) {
				for(int i = 0; i < word.length(); i++) {
					char a = word.charAt(i);
					char b = me.charAt(i);
					if(a == b) {
						tf = true;
					}else {
						System.out.println("��");
					}
				}
			}else {
				System.out.println("��");
			}
			if(tf == true) {
				System.out.println("����");
				break;
			}else {
				
			}
		}

	}

}
