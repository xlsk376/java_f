package F2_문자열2_알고리즘;

import java.util.Arrays;

public class 문자열2_알고리즘_형변환2_문제 {

	public static void main(String[] args) {
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력

		String str = "김철수/87,이만수/42,이영희/95";

		String[] name = new String[3]; // 김철수,이만수,이영희
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
			score[i] = Integer.parseInt(temp3[index]); // 형변환 꼭해주기!!  name은 문자 / score는 숫자
			index += 1;
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
		
		

	}

}
