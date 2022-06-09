package ex14;

public class Account {
	String accountNumber;
	int balance;
	
	public String toString() {
		return "\\" + balance + "(口座番号:" + accountNumber + ")";
	}
	
	//↓ Objectクラスのequalsメソッドのオーバーライド
	@Override  //← jvmにObjectのequalsメソッドと教える
	public boolean equals(Object o) {
		if (this == o) { // アドレスが等しい 本来のObjectクラスのequals()
			return true;
		}
		if (o instanceof Account) {
			Account a = (Account) o; //キャスト演算 して値を同じにした。
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if (an1.equals(an2)) { //accountNumberの文字が同じ
				return true;
			}
		}
		return false;
	}
	
//↓ オーバーロードはダメ
//	public boolean equals(Account_t a) {
//		//objectクラスで比較しているので。オーバーライドしないといけない。
//		String a1 = this.accountNumber.trim(); //trim()で空白をなくす。
//		if (a1.equals(a.accountNumber.trim())) {
//			return true;
//		}
//		return false;
//	}
	
	// equals()を作ったら、hashCode()もオーバーライドする。
	@Override
	public int hashCode() {
		int result = accountNumber.hashCode(); //文字列のhashCodeをresultに入れた。
		result = result * 31 + Integer.hashCode(balance); //素数の31が使われる。
		return result;
	}
	
}

