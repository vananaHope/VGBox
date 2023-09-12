package springweb.a05_mvcexp.a01_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a05_mvcexp.a02_service.A01_MemberService;
import springweb.a05_mvcexp.z01_vo.Emp;
import springweb.a05_mvcexp.z01_vo.Member;

@Controller
public class A01_MemberController {
	
	@Autowired
	private A01_MemberService service;
	
	// http://localhost:5090/springweb/memberList.do
	@RequestMapping("memberList.do")
	public String memberList(Member sch, Model d) {
		System.out.println("# 데이터 크기 #");
		System.out.println(service.memberList(sch).size());
		
		d.addAttribute("memberList", service.memberList(sch));
		
		return "WEB-INF\\views\\a05_mvcexp\\a02_memberList.jsp";
	}
	
	// http://localhost:5020/project/daoexp.do
	@RequestMapping("daoexp.do")
	public String daoexp() {
		service.daoexp();
		service.daoexp03();
		service.empList();
		/* service.daoexp02(); */
		return "";
	}

}
