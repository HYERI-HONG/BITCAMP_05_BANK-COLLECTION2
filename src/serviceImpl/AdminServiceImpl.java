package serviceImpl;

import service.*;
import domain.*;
import repository.MemberDAO;
import repositoryImpl.MemberDAOImpl;

import java.text.SimpleDateFormat;
import java.util.*;

public class AdminServiceImpl implements AdminService {
	private static AdminService instance = new AdminServiceImpl();
	public static AdminService getInstance() {return instance;}
	private AdminServiceImpl() {}

	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		//memberlist.add(staff);

	}

	@Override
	public List<MemberBean> memberlist() {
		//return memberlist;
		return null;
	}

	@Override
	public List<MemberBean> findMemberByName(String name) {
		/*List<MemberBean> temp = new ArrayList();
		for (MemberBean e : memberlist) {
			if (name.equals(e.getName())) {
				temp.add(e);
			}
		}
		return temp;*/
		return null;
	}

	@Override
	public MemberBean findMemberById(MemberBean member) {
		/*MemberBean dap = new MemberBean();
		for (MemberBean e : memberlist) {
			if (member.getUid().equals(e.getUid())) {
				dap = e;
				break;
			}
		}
		return dap;*/
		return null;
	}

	@Override
	public List<AccountBean> accountlist() {
		// return accountlist;
		return null;
	}

	@Override
	public List<AccountBean> findAccountByName(String name) {
	/*	List<AccountBean> temp = new ArrayList();

		for (int i = 0; i < accountlist.size(); i++) {
			if (name.equals(accountlist.get(i).getName())) {
				//temp.add(accountlist.get(i));
			}
		}
		return temp;*/
		return null;
	}

	@Override
	public String createDate() {
		return new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
	}
	@Override
	public String random(int start, int end) {
		String random ="";
		random = String.format("%03d", (int)(Math.random()*end)+start);
		return random;
	}
	@Override
	public String createAccountNum() {
		String accountNum ="";
		for(int i =0; i<3; i++) {
			accountNum += (i==2)? random(0,999):random(0,999)+"-";
		}
		return accountNum;
	}
}
