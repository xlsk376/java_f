package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ5_split����_���� {

	public static void main(String[] args) {
		String str = "aaa/bbbb/ccc";
		
		String[] temp = str.split("/");

		
		// split�� �ڵ����� ���ڿ��� �迭�� ������ش�.
		// split�� ��������ʰ� ���� �߶� �迭�� �־��.
		
		
		//����) �����ڸ� �������� str �� ������ �߶󳻼� temp2 �迭�� ���� 
		String ������ = "/";
		String [] temp2 = null;
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '/') {
				count += 1;
			}
		}
		temp2 = new String[count  + 1]; // �����ڴ� 2�� �̰� ���� ���� �� 3��
		
		for(int i = 0; i < temp2.length; i++) {
			temp2[i] = "";
		}
		System.out.println(Arrays.toString(temp2));
		int k = 0;
		int i = 0;
		while(true) {
			if(str.charAt(k) != '/') {
				temp2[i] += str.charAt(k);
			}else {
				i += 1;
			}
			k += 1;
			if(k == str.length()) {
				break;
			}			
		}
		System.out.println(Arrays.toString(temp2));

	}

}
