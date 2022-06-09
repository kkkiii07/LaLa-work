package ex14;

import chap14.Hero;

public class Main14_1 {

	public static void main(String[] args) {
		Account_20220609 a = new Account_20220609();
		a.accountNumber = "4649";
		a.balance = 1592;
		System.out.println(a);
		
		a.accountNumber = " 4649";
		Account_20220609 a2 = new Account_20220609();
		a2.accountNumber = "4649 ";
		
		if (a.equals(a2)) {
			System.out.println("同じ");
		} else {
			System.out.println("違う");
		}
		
		Hero h = new Hero();
		if (a.equals(h)) {
			System.out.println("同じ");
		} else {
			System.out.println("違う");
		}
		
		
	}

}
