package serviceImpl;

import java.text.SimpleDateFormat;
import java.util.*;
import domain.*;
import service.*;
//날짜 구하기
import java.text.SimpleDateFormat;


public class AccountServiceImpl implements AccountService {
	private static AccountService instance = new AccountServiceImpl();
	public static AccountService getInstance() {return instance;}
	private AccountServiceImpl() {}
	
	@Override
	public void createAccount(AccountBean account) {
			account.setCreateDate(AdminServiceImpl.getInstance().createDate());
			account.setAccountNum(AdminServiceImpl.getInstance().createAccountNum());
			System.out.println("==========어카운트 서비스==========");
			System.out.println("최종 객체 :"+account);
			
	}
	@Override
	public void createMinusAccount(MinusAccountBean account) {
			account.setCreateDate(AdminServiceImpl.getInstance().createDate());
			account.setAccountNum(AdminServiceImpl.getInstance().createAccountNum());
			System.out.println("======= 마이너스 어카운트 서비스======");
			System.out.println("최종 객체 :"+account);
	}
	@Override
	public AccountBean findById(AccountBean account) {
		AccountBean temp = new AccountBean();
		/*for(int i =0; i<list.size(); i++) {
			if(account.getUid().equals(list.get(i).getUid())) {
				temp = list.get(i);
				break;
			}
		}*/
		return temp;
	}
	
	@Override
	public void updatePassword(AccountBean account) {	
		//list.get(list.indexOf(findById(account))).setPass(account.getPass());
	}
	
	@Override
	public void deleteAccount(AccountBean account) {
		//list.remove(findById(account));	
	}
}
