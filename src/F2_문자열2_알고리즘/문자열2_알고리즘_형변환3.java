package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ3 {

	public static void main(String[] args) {
		// ����) �̸��� ������ �Ʒ��Ͱ��� �ϳ��� ���ڿ��� ����
		// ����) "��ö��/87,�̸���/42,�̿���/95"

		String[] name = { "��ö��", "�̸���", "�̿���" };
		int[] score = { 87, 42, 95 };

		String str = "";
		String temp[] = new String[3];
		for(int i = 0; i < score.length; i++) {
			temp[i] = score[i] + "";
		}
		System.out.println(Arrays.toString(temp));
		for(int i = 0; i < score.length; i++) {
			str += name[i] + "/" + temp[i] + ",";
		}
		str = str.substring(0, str.length()-1);
		System.out.println(str);

	}

}
