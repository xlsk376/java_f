package F1_���ڿ�1_�⺻�̷�;

import java.util.Arrays;

public class ���ڿ�1_�⺻�̷�8_���ڿ��迭 {

	public static void main(String[] args) {
		String [] test = {"aaa" , "bbb" , "ccc"};
		System.out.println(Arrays.toString(test));
		
		
		// String �� �迭�� ���鶧 new �� ����ԵǸ� null �� �ʱ�ȭ �Ǿ��ִ�.
		String [] temp = new String[3];		
		System.out.println(Arrays.toString(temp));
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = ""; // ��������� �ʱ�ȭ
		}
		System.out.println(Arrays.toString(temp));

	}

}
