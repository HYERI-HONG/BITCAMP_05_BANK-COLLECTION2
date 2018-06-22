package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

enum MemberButt {
	EXIT, ADD,JOIN, LIST, FIND_BY_ID, FIND_BY_NAME,UPDATE, REMOVE
}

public class MemberController {
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() {
		return instance;
	}
	private MemberController() {}
	
	public void join(UserBean user) {
	
		System.out.println("==========멤버 컨트롤러==========");
		System.out.println("화면에서 넘어온 객체 :"+user);
		MemberServiceImpl.getInstance().createUser(user);
	}
	public void updatePassword() {
		MemberBean member= new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPass(JOptionPane.showInputDialog("기존 비밀번호")+ "/" + JOptionPane.showInputDialog("새 비밀번호"));
		MemberServiceImpl.getInstance().updatePassword(member);
	}
	public void deleteMember() {
		MemberBean member= new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		MemberServiceImpl.getInstance().deleteMember(member);
	}
}
