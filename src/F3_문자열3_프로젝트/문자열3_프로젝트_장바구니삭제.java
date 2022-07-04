package F3_문자열3_프로젝트;

import java.util.Arrays;

public class 문자열3_프로젝트_장바구니삭제 {

	public static void main(String[] args) {
		String item = "칸쵸/새우깡/고래밥/콜라/사이다";
		String id = "qwer/abcd/java";
		
		String cart = "";
		cart += "qwer/고래밥\n";
		cart += "qwer/새우깡\n";
		cart += "abcd/콜라\n";
		cart += "java/칸쵸\n";
		cart += "qwer/칸쵸\n";
		cart += "java/고래밥\n";
		cart += "abcd/사이다";
		
		 String input[][] = {
				 {"qwer" , "3"}, 
				 {"abcd" , "1"}};
		// cart데이터는 현재 장바구니 상황이다.
		// input데이터는 삭제를 요청한데이터이다.
		
		// qwer은 아이디이고  3 은 삭제번호이다.
		// qwer 입장에서는 본인아이템은 3개밖에 없으니 칸쵸를 지우기위해 3을 
		// 선택했지만 실제 전체 데이터에서는 5번째 아이템이다. 
		
		// 마찬가지로 abcd 는 콜라와 사이다 를 구입했고 ,
		// 콜라를 지우기위해 1번을 선택한것이고 실제로는3번아이템이 삭제되어야한다.
		
		/*
		 [ 정답 ]
		    cart += "qwer/고래밥\n";
			cart += "qwer/새우깡\n";
			cart += "java/칸쵸\n";
			cart += "java/고래밥\n";
			cart += "abcd/사이다";
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
