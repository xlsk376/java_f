package F3_���ڿ�3_������Ʈ;

import java.util.Arrays;

public class ���ڿ�3_������Ʈ_��ٱ��ϻ��� {

	public static void main(String[] args) {
		String item = "ĭ��/�����/����/�ݶ�/���̴�";
		String id = "qwer/abcd/java";
		
		String cart = "";
		cart += "qwer/����\n";
		cart += "qwer/�����\n";
		cart += "abcd/�ݶ�\n";
		cart += "java/ĭ��\n";
		cart += "qwer/ĭ��\n";
		cart += "java/����\n";
		cart += "abcd/���̴�";
		
		 String input[][] = {
				 {"qwer" , "3"}, 
				 {"abcd" , "1"}};
		// cart�����ʹ� ���� ��ٱ��� ��Ȳ�̴�.
		// input�����ʹ� ������ ��û�ѵ������̴�.
		
		// qwer�� ���̵��̰�  3 �� ������ȣ�̴�.
		// qwer ���忡���� ���ξ������� 3���ۿ� ������ ĭ�ݸ� ��������� 3�� 
		// ���������� ���� ��ü �����Ϳ����� 5��° �������̴�. 
		
		// ���������� abcd �� �ݶ�� ���̴� �� �����߰� ,
		// �ݶ� ��������� 1���� �����Ѱ��̰� �����δ�3���������� �����Ǿ���Ѵ�.
		
		/*
		 [ ���� ]
		    cart += "qwer/����\n";
			cart += "qwer/�����\n";
			cart += "java/ĭ��\n";
			cart += "java/����\n";
			cart += "abcd/���̴�";
		 */
		 String idList[] = id.split("/");
		 int index = 0;
		 int index1 = 0;
		 for(int i = 0; i < idList.length; i++) {
			 int count = 0;
			 String idToken[] = idList[i].split(",");
			 String itemList[] = item.split("/");
			 //System.out.print(idToken[0] + " ==> ");
//			 for(int j = 0; j < itemList.length; j++) {
//				 String itemToken[] = itemList[j].split(",");
//			 }
			 String cartList[] = cart.split("\n");
			 String countList[][] = new String[cartList.length][2];
			 for(int j = 0; j < cartList.length; j++) {
				 String cartToken[] = cartList[j].split("/");
				 countList[j][1] = "0"; 
				 if(cartToken[0].equals(idToken[0])) {
					 count += 1;
					 countList[j][0] = idToken[0];
					 countList[j][1] = count + "";
				 }
				 if(input[0][0].equals(countList[j][0]) && input[0][1].equals(countList[j][1])){
					 countList[j][1] = "0";
					 cartList[j] = "";
					 index = j;
				 }else if(input[1][0].equals(countList[j][0]) && input[1][1].equals(countList[j][1])) {
					 countList[j][1] = "0";
					 cartList[j] = "";
					 index1 = j;
				 }
			 }
//			 for(int j = 0; j < countList.length; j++) {
//				 if(countList[j][1].equals("0") == false) {
//					 System.out.print(countList[j][1] + " ");
//					 System.out.print(countList[j][0] + " ");
//				 }
//			 }
			 
			 System.out.println();
		 }
		 String temp = "";
		 int index2 = 0;
		 String cartList[] = cart.split("\n");
		 for(int i = 0; i < cartList.length; i++) {
			 if(index != i && index1 != i) {
				 temp += cartList[i] + "\n";
			 }
		 }
		 System.out.println(temp);
		 
		 
		 
		 
		 
		 

	}

}
