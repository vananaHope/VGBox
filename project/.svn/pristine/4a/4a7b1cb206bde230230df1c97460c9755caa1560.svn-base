package springweb.a04_dept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import backendWeb.z01_vo.Dept;

@Controller
public class A01_DeptController {

	@Autowired
	private A02_DeptService service;
	
	/*
	 요청메서드 선언
	 1. url 패턴 ex) @RequestMapping("deptList01.do")
	 	http://localhost:5090/springweb/deptList01.do
	 2. 요청값 ==> ename=@@@&loc=@@@ ==> Dept(setEname,setLoc)
	 3. 모델 데이터 ==> view단 넘길 데이터
	 	model.addAttribute("모델명",service.XXXX());
	 4. view단 처리
	 	return "" : jsp 경로 위치 복사
	  	
	 * */
	@RequestMapping("deptList01.do")
	public String deptList(Dept sch, Model model) {
		model.addAttribute("deptList", service.getDeptList(sch));
		
		
		return "WEB-INF\\views\\a04_dept\\a01_deptList.jsp";
	}
}
