package F2_���ڿ�2_������Ʈ;

import java.util.Scanner;

public class ���ڿ�2_������Ʈ_�ܾ�˻�_���� {

	public static void main(String[] args) {
		/*
		 * # �ܾ� �˻�
		 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
		 * 2. �ܾ �����ϸ� ��������Ѵ�.
		 * 3. �κа˻��� �Ǿ���Ѵ�. 
		 * 	��) ch ==> school , teacher , child
		 */

		Scanner scan = new Scanner(System.in);

		String[] text = { "school", "teacher", "child", "father", "love" };

		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String word = scan.nextLine();
		
		int wordCount = 0; // �ܾ�
		String[] wordList = new String[text.length];
		
		for(int i = 0; i < text.length; i++) {
			String sample = text[i];
			for(int j = 0; j < sample.length() - word.length() + 1; j++) {
				int count = 0;
				for(int k = 0; k < word.length(); k++) {
					if(sample.charAt(j + k) == word.charAt(k)) { // text �� ���ڿ� �Է��� ���ڰ� ��ġ�ϴ��� Ȯ��
						count += 1;
					}
				}
				if(count == word.length()) { // text �� ���ڿ� �Է��� ���ڰ� ��ġ�Ѵٸ� �ܾ wordList�� �ְ� ���´�
					wordList[wordCount] = sample;
					wordCount += 1;
					break;
				}
			}
		}		
		for(int i =0; i < wordCount; i++) {
			System.out.println(wordList[i]);
		}

	}

}
