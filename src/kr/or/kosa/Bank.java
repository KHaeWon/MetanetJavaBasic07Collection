package kr.or.kosa;

import java.util.LinkedList;
import java.util.List;

//하나의 은행은 계좌를 가지지 않을 수도, 여러 개의 계좌를 가질 수도 있다.
//하나의 계좌는 하나의 은행을 갖는다.

public class Bank{

	private List<Account> accounts; 
	private int totalAccount;
	
	Bank(){
		accounts = new LinkedList<>();
		this.totalAccount=0;
	}
	//계좌목록
	List<Account> findAccounts(String name){//똑같은 이름의 사람이 여러 명 있을 수 있어서 list로 받음
		
		return accounts;
	}
	
	void addAccount(String accountNo, String name) {
		Account value = new Account(accountNo, name);
		accounts.add(value);
	}
	
//	Account getAccount(String accountNo) {
//		 
//	}
	
	//List<Account>
	
	
	
	
}
