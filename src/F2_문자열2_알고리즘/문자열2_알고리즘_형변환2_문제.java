package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ2_���� {

	public static void main(String[] args) {
		// ����) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���

		String str = "��ö��/87,�̸���/42,�̿���/95";

		String[] name = new String[3]; // ��ö��,�̸���,�̿���
		int[] score = new int[3]; // 87,42,95
		String[] temp = str.split(",");
		String[] temp3 = new String[6];
		int index = 0;
		for(int i = 0; i < temp.length; i++) {
			String temp2[] = temp[i].split("/");
			for(int j = 0; j < temp2.length; j++) {
				System.out.println(temp2[j]);
				temp3[index] = temp2[j];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(temp3));
		index = 0;
		for(int i = 0; i < 3; i++) {
			name[i] = temp3[index];
			index += 1;
			score[i] = Integer.parseInt(temp3[index]); // ����ȯ �����ֱ�!!  name�� ���� / score�� ����
			index += 1;
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
		
		

	}

}
