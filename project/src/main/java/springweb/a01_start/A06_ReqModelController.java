package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class A06_ReqModelController {
	// http://localhost:5088/springweb/form02.do
	
	// form 형태의 요청값 => 모델 데이터 처리
	//	==> 화면단에 출력
	// url 패턴은 중복이 되지 않아야 한다.
	// GetMapping : get방식으로 호출할 때 활용하는 형식
	// get 방식은 url 치면 바로 호출됨
	
	@GetMapping("form01.do")
	public String showInfo() {
		System.out.println("호출1");
		return "WEB-INF\\views\\a08_req_model_form.jsp";
	}
	
	// Post 방식으로 호출하는 형태
	// form에 명시적으로 속성을 method="post"로 할 때만 호출
	@PostMapping("form01.do")
	public String showInfo2(@RequestParam("title") String title, Model d) {
		
		System.out.println("호출2");
		System.out.println("요청값 타이틀:"+title);
		d.addAttribute("m01", title+", 모델 데이터");
		
		
		return "WEB-INF\\views\\a08_req_model_form.jsp";
	}
	// ex) get form2.do
	//		post form2.do
	//	화면 : a09_form.jsp
	//	좋아하는 연예인 이름: [	][등록]
	//	모델 데이터 : @@@@를 좋아하는 연예인이네요
	
	@GetMapping("form02.do")
	public String showExp01() {
		System.out.println("get방식");
		return "WEB-INF\\views\\a09_form.jsp";
	}
	
	@PostMapping("form02.do")
	public String showExp02(@RequestParam("person") String person,
							Model d) {
		System.out.println("post방식");
		d.addAttribute("p1", person+"를 좋아하시네요");
		
		return "WEB-INF\\views\\a09_form.jsp";
	}
	
}
