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
		while (true) {
			System.out.println(Arrays.toString(check));
			System.out.println("�� : " + meaning);
			System.out.print("���� : ");
			for (int i = 0; i < size; i++) {
				char a = word.charAt(i);
				if(check[i] == 1) {
					System.out.print(a);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
			System.out.println("����ܾ �Է��ϼ��� >>> ");
			String me = scan.next();
			if(word.length() == me.length()) {
				
			}else {
				System.out.println("��");
				score -= 5;
				for(int i = 0; i < check.length;) {
					int r = ran.nextInt(size);
					if(check[i] == 1) {
						i += 1;
						continue;
					}
					if(check[i] == 0 && r != i) {
						check[r] = 1;
						break;
					}
				}
			}
		}
		

	}

}
