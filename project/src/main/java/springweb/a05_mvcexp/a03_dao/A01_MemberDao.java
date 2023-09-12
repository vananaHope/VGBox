package springweb.a05_mvcexp.a03_dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import springweb.a05_mvcexp.z01_vo.Dept;
import springweb.a05_mvcexp.z01_vo.Emp;
import springweb.a05_mvcexp.z01_vo.Employee;
import springweb.a05_mvcexp.z01_vo.Job;
import springweb.a05_mvcexp.z01_vo.Location;
import springweb.a05_mvcexp.z01_vo.Member;
import springweb.a05_mvcexp.z01_vo.Student;
// springweb.a05_mvcexp.a03_dao.A01_MemberDao
public interface A01_MemberDao {
	
	public List<Member> memberList(Member sch);
	public String exp01();
	
	public String exp02();
	public int exp03();
	
	public String exp04(String ename);
	
	public int exp05(int empno);
	public int exp06(String ename);
	public Date exp07(int empno);
	
	public void exp08Ins(Dept ins);
	
	public void exp09Ins(Student ins);
	
	public List<Emp> elist(Emp sch);
	
	public void exp10Ins(Location loc);
	
	public List<Emp> exp12EmpList(Map sch);
	
	public List<Emp> exp13EmpList(Map sch);
	
	public void exp14DeptInsert(@Param("no") int deptno,
			@Param("dpartnm") String dname,
			@Param("location") String loc);
	
	public List<Emp> exp15EmpList(
			@Param("startDte") String startDte,
			@Param("endDte") String endDte);
	
	public List<Student> exp16StuList(@Param("stuName") String stuName,
								@Param("minAvg") int minAvg,
								@Param("maxAvg") int maxAvg);
	
	public Employee getEmployee(
			@Param("id") int employee_id);
	
	public Job getJob(@Param("job_id") String job_id);
	
	public List<String> exp19getEnames(@Param("minSal") int minSal,
			@Param("maxSal") int mxSal);
	
	public List<String> exp20getLocations(@Param("country_id") String country_id);

	public List<Emp> getEmpResultExp();
	
	public List<Dept> getDeptResultExp();
}

/*
  
==> Dao를 만들려면?
  sql
  매개변수
  리턴데이터
  ==> Mapper.xml ==> A01_MemberDao 상속 받은 실제 객체가 만들어진다.
  연동 규칙을 설정
  		mapper.xml		interface
  	1. namespace		 springweb.a05_mvcexp.a03_dao.A01_MemberDao
  	2. id				 메서드명 memberList
  	3. parameterType	 Member: 공통 mybatis에서 지정이름
  	4. resultType	 	 List<Member>
  	5. sql
  		getXXXX호출		 ==> 실제 메서드가 만들어져서 사용 가능하다.
  	
  	
*/
