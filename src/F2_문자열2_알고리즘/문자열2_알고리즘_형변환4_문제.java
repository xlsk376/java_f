package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ4_���� {

	public static void main(String[] args) {
		String str = "��ö��/87,�̸���/42,�̿���/95";

		// �� �����Ϳ��� �õ��� ������ �ٽ� ���ڿ��� ����

		// 1) ���ڿ��� �߶� �迭�� �����Ѵ�.
		// 2) �迭���� �õ��� �����Ѵ�
		// 3) �����ѹ迭�� �ٽ� ���ڿ��� �����.

		// str = "��ö��/87,�̿���/95";
		//�� Ǯ��
//		int score[] = new int[3];
//		String name[] = new String[3];
//		String temp[] = str.split(",");
//		String temp3[] = new String[6];
//		int index = 0;
//		for(int i = 0; i < temp.length; i++) {
//			String temp2[] = temp[i].split("/");
//			for(int j = 0; j < temp2.length; j++) {
//				temp3[index] = temp2[j];
//				index += 1;
//			}
//		}
//		System.out.println(Arrays.toString(temp3));
//		index = 0;
//		for(int i = 0; i < name.length; i++) {
//			name[i] = temp3[index];
//			index += 1;
//			score[i] = Integer.parseInt(temp3[index]);
//			index += 1;
//		}
//		System.out.println(Arrays.toString(name));
//		System.out.println(Arrays.toString(score));
//		int min = 95;
//		int index1 = 0;
//		for(int i = 0; i < score.length; i++) {
//			if(min > score[i]) {
//				index1 = i;
//			}
//		}
//		System.out.println(index1);
//		index = 0;
//		String temp4[] = new String[4];
//		for(int i = 0; i < score.length; i++) {
//			if(i != 1) {
//				temp4[index] = name[i];
//				index += 1;
//				temp4[index] = score[i] + "";
//				index += 1;
//			}
//		}
//		System.out.println(Arrays.toString(temp4));
//		index = 0;
//		String temp5 = "";
//		for(int i = 0; i < temp4.length/2; i++) {
//			temp5 += temp4[index] + "/";
//			index += 1;
//			temp5 += temp4[index] + ",";
//			index += 1;
//		}
//		str = temp5.substring(0, temp5.length()-1);
//		System.out.println(str);
		
		String tokens[] = str.split(",");
		System.out.println(tokens.length);
		System.out.println(Arrays.toString(tokens));
		String name[] = new String[tokens.length];
		int score[] = new int[tokens.length];
		
		
		for(int i = 0; i < tokens.length;i++) {
			String values[] = tokens[i].split("/");
			name[i] = values[0];
			score[i] = Integer.parseInt(values[1]);
		}
		
		
		int index = 0;
		int max = score[0];
		for(int i = 0; i < score.length; i++) {
			if(score[i] < max) {
				max = score[i];
				index = i;
			}
		}
		str = "";
		
		for(int i = 0; i < name.length; i++) {
			if(i != index) {
				str += name[i];
				str +="/";
				str += score[i];
				str += ",";
			}
		}
		System.out.println(str);
		str = str.substring(0 , str.length()-1);
		System.out.println(str);

	}

}
