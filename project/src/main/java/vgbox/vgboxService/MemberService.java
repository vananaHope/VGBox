package vgbox.vgboxService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vgbox.vgboxDB.DAO.MemberDao;
import vgbox.vgboxDB.VO.Member;
import vgbox.vgboxDB.VO.Seller;

@Service
public class MemberService {
	@Autowired
	public MemberDao dao;
	
	
	
	// 아이디 중복 체크
	public String checkID(String choice, String id) {
		String check = "";
		
		if(!choice.equals("")) {
			if(choice.equals("user")) {
				if(dao.checkID(id) == null) {
					check = "true";
				} else if (dao.checkID(id) != null) {
					check = "false";
				}
			}
			
			if(choice.equals("seller")) {
				if(dao.checkIDs(id) == null) {
					check = "true";
				} else if(dao.checkIDs(id) != null) {
					check = "false";
				}
			}
		}

		
		return check;
	}

	// 회원가입
	public String join(String choice, Member m, Seller s) {
		
		String result = "";
		
		if(!choice.equals("")) {
			if(choice.equals("user")) {
				dao.join(m);
				result = "회원가입 성공";
			}else if(choice.equals("seller")) {
				dao.joinSeller(s);
				result = "회원가입 성공";
			}
		
		}else {
			result = "회원가입 실패";
		}
		return result;
	}
	
	// 로그인
	
	
}	
