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
		Random ran = new Random();
		int score = 100;
		String word = "performance";
		String meaning = "����";
		int size = word.length();
		int check[] = new int[size]; // ��Ʈ üũ�� ���ؼ� Ȯ���Ҽ��ִ�.
//		for(int i = 0; i < size; i++) {
//			char a = word.charAt(i);
//			check[i] = a;
//		}
		int temp[] = new int[size];
		for(int i = 0; i < size; i++) {
			char b = word.charAt(i);
			temp[i] = b;
		}
		for(int i = 0; i < size; i++) {
			int r1 = ran.nextInt(size);
			int r2 = ran.nextInt(size);
			int t = temp[r1];
			temp[r1] = temp[r2];
			temp[r2] = t;
		}
		int count = size;
		while (true) {
			System.out.println("�� : " + meaning);
			System.out.print("���� : ");
			for (int i = 0; i < size; i++) {
				if(check[i] == 0) {
					System.out.print("*");
				}else {
					System.out.print((char)check[i]);
				}
			}
			if(count == 0) {
				break;
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
				for(int i = 0; i < size; i++) {
					char c = word.charAt(i);
					if(c == temp[0]) {
						check[i] = c;
					}
				}
				for(int i = 0; i < count-1; i++) {
					temp[i] = temp[i+1];
				}
				temp[count-1] = 0;
				count -= 1;
				System.out.println(Arrays.toString(temp));
			}
		}

	}

}
