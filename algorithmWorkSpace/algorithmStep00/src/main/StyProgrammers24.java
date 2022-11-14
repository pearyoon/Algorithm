package main;

public class StyProgrammers24 {

	public static void main(String[] args) {
		int price = 580000;
		int answer = 0;
		int discount = 0;
		
		if(price >= 500000) {
			discount = (int)(price*0.2);
		} else if(price >= 300000) {
			discount = (int)(price*0.1);
		} else if(price >= 100000) {
			discount = (int)(price*0.05);
		}
		
		answer = price-discount;
		
		System.out.println(answer);
		
		// 내일 수정예정
	}

}
