package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ1_���� {

	public static void main(String[] args) {
		// ���ڿ� �Լ��� ����ؼ� Ǯ���

		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		int[] arr = new int[3];
		int total = 0;
		String[] a = str.split("/"); // '11' , '100' , '89'
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(a[i]);
			total += arr[i];
		}
		System.out.println(total);

		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
		int[] scores = { 11, 100, 89 };
		String text = "";
		for(int i = 0; i < scores.length; i++) {
			text += scores[i] + "/";
		}
		text = text.substring(0, text.length()-1); // ���ϵڿ� "/" �� ����
		System.out.println(text);
		
		
		
		

	}

}
