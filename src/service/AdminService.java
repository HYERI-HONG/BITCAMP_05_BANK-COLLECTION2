package service;

import java.util.List;
import domain.*;

public interface AdminService {
	public void createStaff(StaffBean staff);
	public List<MemberBean> memberlist();
	public List<MemberBean> findMemberByName(String name);
	public MemberBean findMemberById(MemberBean member);
	
	public List<AccountBean> accountlist();
	public List<AccountBean> findAccountByName(String param);
	
	public String createDate();
	public String random(int start, int end);
	public String createAccountNum();
}
