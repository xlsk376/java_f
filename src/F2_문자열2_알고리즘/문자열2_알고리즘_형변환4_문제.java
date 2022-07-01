package F2_문자열2_알고리즘;

import java.util.Arrays;

public class 문자열2_알고리즘_형변환4_문제 {

	public static void main(String[] args) {
		String str = "김철수/87,이만수/42,이영희/95";

		// 위 데이터에서 꼴등을 삭제후 다시 문자열로 변경

		// 1) 문자열을 잘라서 배열에 저장한다.
		// 2) 배열에서 꼴등을 삭제한다
		// 3) 삭제한배열을 다시 문자열로 만든다.

		// str = "김철수/87,이영희/95";
		//내 풀이
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
