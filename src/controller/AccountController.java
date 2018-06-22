
package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.AccountService;
import serviceImpl.AccountServiceImpl;
import serviceImpl.AdminServiceImpl;

public class AccountController {
	private static AccountController instance = new AccountController();
	public static AccountController getInstance() {
		return instance;
	}
	private AccountController() {}
	public void account(AccountBean account) {
		System.out.println("==========어카운트 컨트롤러==========");
		System.out.println("화면에서 넘어온 객체 :"+account);
		AccountServiceImpl.getInstance().createAccount(account);
	}
	public void minusAccount(AccountBean account) {
		AccountServiceImpl.getInstance().createMinusAccount((MinusAccountBean) account);
	}
	public void findById() {
		AccountBean account= new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디 : "));
		JOptionPane.showMessageDialog(null,(AccountServiceImpl.getInstance().findById(account).toString()));
	}
	public void changePass() {
		AccountBean account= new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디 : "));
		account.setPass(JOptionPane.showInputDialog("기존 비밀번호") + "/" + JOptionPane.showInputDialog("새 비밀번호"));
		AccountServiceImpl.getInstance().updatePassword(account);
	}
	public void deleteAccount() {
		AccountBean account= new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디 : "));
		AccountServiceImpl.getInstance().deleteAccount(account);
	}
}