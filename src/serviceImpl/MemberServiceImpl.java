package serviceImpl;

import java.util.*;
import domain.*;
import repository.*;
import repositoryImpl.*;
import service.*;

public class MemberServiceImpl implements MemberService{
	private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {
		return instance;
	}
	MemberDAO dao;
	private MemberServiceImpl() {
		//dao = new MemberDAOImpl();
	}
	@Override
	public void createUser(UserBean user) {
		System.out.println("==========멤버 서비스==========");
		System.out.println("컨트롤러에서 넘어온 객체 :"+user);
		user.setCreditRating("7등급");
		dao.insertMember(user);
	}
	@Override
	public void updatePassword(MemberBean member) {
		//list.get(list.indexOf(search(member))).setPass(member.getPass());
	}
	@Override
	public void deleteMember(MemberBean member) {
		//list.remove(list.indexOf(search(member)));
	}
	@Override
	public String login(UserBean user) {
		return null;
	}
	
}
