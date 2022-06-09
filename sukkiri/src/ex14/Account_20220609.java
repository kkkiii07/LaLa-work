package ex14;

public class Account_20220609 {
	String accountNumber;
	int balance;
	
	public String toString() {
		return "\\" + balance + "(口座番号:" + accountNumber + ")";
	}
	
	public boolean equals(Account_20220609 a) {
		//objectクラスで比較しているので。オーバーライドしないといけない。
		String a1 = this.accountNumber.trim(); //trim()で空白をなくす。
		if (a1.equals(a.accountNumber.trim())) {
			return true;
		}
		return false;
	}
	
}


//