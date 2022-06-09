package ex14;

import java.util.ArrayList;
import java.util.List;

public class Main14_t {

	public static void main(String[] args) {
		Account a = new Account();
		a.accountNumber = "4649";
		a.balance = 1592;
		System.out.println(a);
		
		a.accountNumber = " 4649";
		Account a2 = new Account();
		a2.accountNumber = "4649 ";
		
		if (a.equals(a2)) {
			System.out.println("同じ");
		} else {
			System.out.println("違う");
		}
		
		a.accountNumber = "4649";
		List<Account> aList = new ArrayList<>();
		//↑ Account[]配列を作ったという事
		aList.add(a);
		showList(aList);
		
		//新しくAccount()を作って上と同じ内容を入れた。
		//equalsで比べる。番地が違っていても値が同じであればtrueとなるはず。
		a = new Account();
		a.accountNumber = "4649";
		a.balance = 1592;
		aList.remove(a); //上と同じものなら削除してと命令。番地が違うので削除してくれない。別物と判断。
		showList(aList);
	}
	
	private static void showList(List<Account> aList) {
		for (Account a : aList) {
			System.out.print("accountNumber:" + a.accountNumber);
			System.out.println(" balance:" + a.balance);
		}
		System.out.println("要素数:" + aList.size());
	}

}
