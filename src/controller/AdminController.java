package controller;

import javax.swing.JOptionPane;

import domain.*;
import service.*;
import serviceImpl.*;

public class AdminController {
	private static AdminController instance = new AdminController();
	public static AdminController getInstance() {
		return instance;
	}
	private AdminController() {}
	public void add() {
		MemberBean member = new StaffBean();
		member.setName(JOptionPane.showInputDialog("이름 : "));
		member.setSsn(JOptionPane.showInputDialog("주민 번호 : "));
		member.setAddr(JOptionPane.showInputDialog("주소 : "));
		member.setPhone(JOptionPane.showInputDialog("연락처 : "));
		member.setEmail(JOptionPane.showInputDialog("이메일 : "));
		member.setUid(JOptionPane.showInputDialog("아이디 : "));
		member.setPass(JOptionPane.showInputDialog("비밀 번호 : "));
		AdminServiceImpl.getInstance().createStaff((StaffBean) member);
	}
	public void memberlist() {
		MemberBean member= new MemberBean();
		
	}
	public void findMemberById() {
		MemberBean member= new MemberBean();
		
		member.setUid(JOptionPane.showInputDialog("아이디"));
		JOptionPane.showMessageDialog(null, AdminServiceImpl.getInstance().findMemberById(member).toString());
	}
	public void findMemberByName() {
		JOptionPane.showMessageDialog(null, AdminServiceImpl.getInstance().findMemberByName(JOptionPane.showInputDialog("이름").toString()));
	}
	public void accountlist() {
		//JOptionPane.showMessageDialog(null,AdminServiceImpl.getInstance().map());
	}
	public void findAccountByName() {
		JOptionPane.showMessageDialog(null,AdminServiceImpl.getInstance().findAccountByName(JOptionPane.showInputDialog("이름 : ").toString()));
	}
	
}
