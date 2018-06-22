package repository;

import domain.*;
import java.util.List;

public interface AccountDAO {
	public void insertAccount(AccountBean account);
	public List<AccountBean> selectAccountList();
	public List<AccountBean> selectAccountByName(String name);
	public AccountBean selectAccountById(String id);
	public int countAccount();
	public void updateAccount(AccountBean member);
	public void deleteAccount(AccountBean member);
	
}
