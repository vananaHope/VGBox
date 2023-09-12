package vgbox.vgboxDB.DAO;

import org.apache.ibatis.annotations.Param;

import vgbox.vgboxDB.VO.Member;
import vgbox.vgboxDB.VO.Seller;

// vgbox.vgboxDB.DAO.MemberDao
public interface MemberDao {
	
	// 회원가입
	public void join(Member ins);
	public void joinSeller(Seller ins);
	
	// 아이디 중복 체크
	public Member checkID(@Param("id") String id);
	public Seller checkIDs(@Param("id") String id);
	
	// 로그인
	public Member login(@Param("id") String id, @Param("password") String pass);
	public Seller loginS(@Param("id") String id, @Param("password") String pass);
}
