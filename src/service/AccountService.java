package service;

import javax.swing.JOptionPane;
import domain.*;
import java.util.*;


public interface AccountService {
	public void createAccount(AccountBean account);
	public void createMinusAccount(MinusAccountBean account);
	public AccountBean findById(AccountBean account);
	public void updatePassword(AccountBean account);
	public void deleteAccount(AccountBean account);
	
	
}
