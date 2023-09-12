package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import backendWeb.z01_vo.Dept;
import backendWeb.z01_vo.Product;

@Controller
public class A04_ModelView {
	@RequestMapping("modelExp01.do")
	public String modelExp01(Model d) {
		// 모델 데이터에 객체 선언
		// http://localhost:5088/springweb/modelExp01.do
		d.addAttribute("prod", new Product("사과",3000,2));
		
		// jsp 
		// ${prod.name}		Product		getName()
		// ${prod.price}	Product		getPrice()
		// ${prod.cnt}		Product		getCnt()
		
		return "WEB-INF\\views\\a01_start\\a01_model01.jsp";
	}
	// modelExp02.do
	// Dept객체를 이용해서 부서번호 부서명 부서위치를 모델 객체로
	// 저장 후 view 단에서 출력하세요
	// http://localhost:5088/springweb/modelExp02.do
	@RequestMapping("modelExp02.do")
	public String modelExp02(Model d) {
		
		d.addAttribute("dept", new Dept(1010,"IT부서","서울"));
		
		return "WEB-INF\\views\\a01_start\\a01_model02.jsp";
	}
	
}
