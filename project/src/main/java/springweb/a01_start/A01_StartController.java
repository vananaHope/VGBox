package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import backendWeb.z01_vo.Team;
import backendWeb.z01_vo.Person;

// springweb.a01_start.A01_StartController
@Controller
public class A01_StartController {
	// http://localhost:5088/springweb/start.do?name
	@RequestMapping("/start.do")
	public String start(@RequestParam("name") String name,
			Model d) {
		
		// view단에 넘겨줄 핵심 데이터 : 모델 데이터
		// jsp ==> ${msg}	
		d.addAttribute("msg","안녕하세요 스프링 모델 데이터");
		
		return "WEB-INF\\views\\a01_start.jsp";
	}
	
	public String start2() {
		
		return "WEB-INF\\views\\a02_callView.jsp";
	}
	// 단일 요청키
	// req01.do?name=홍길동&age=25
	@RequestMapping("req01.do")
	public String req01(@RequestParam("name") String name,
						@RequestParam("age") int age) {
		
		System.out.println("받은 요청값:"+name);
		System.out.println("받은 요청값:"+age);
		return ""; // webapp 하위에 index.jsp 호출
	}
	//http://localhost:5088/springweb/req02.do
	// req02.do?pname=사과&price=3000&cnt=5
	@RequestMapping("req02.do")
	public String req02(@RequestParam("pname") String pname,
						@RequestParam("price") int price,
						@RequestParam("cnt") int cnt) {
		
		System.out.println("물건명:"+pname);
		System.out.println("가격:"+price);
		System.out.println("갯수:"+cnt);
		return "";
	}
	
	@RequestMapping("req03.do")
	public String req03(@RequestParam("names") String[] names) {
		
		for(int i = 0; i<names.length; i++) {
		System.out.println("이름"+(i+1)+")"+":"+names[i]);
		
		}
		return "";
	}
	// req04.do?name=홍길동&age=25&loc=서울
	// 1. 위 내용을 받을 수 있는 기능 메서드 property가 있는 클래스
	// 		생성 또는 확인
	// 2. setName(String), setAge(int), setLoc(String)

	@RequestMapping("req04.do")
	public String req04(Person p01) {
		System.out.println("요청값 내용(Person)");
		System.out.println("이름:"+p01.getName());
		System.out.println("나이:"+p01.getAge());
		System.out.println("사는곳:"+p01.getLoc());
		
		return "";
	}
	
	// ex1) req05.do?name=사과&price=3000&cnt=2
	// ex2) req06.do?tname=LG&win=5&def=2
	// http://localhost:5088/springweb/
	
	@RequestMapping("req05.do")
	public String req05(@RequestParam("name") String name,
						@RequestParam("price") int price,
						@RequestParam("cnt") int cnt) {
		
		System.out.println("이름:"+name);
		System.out.println("가격:"+price);
		System.out.println("갯수:"+cnt);
		
		return "";
	}
	
	@RequestMapping("req06.do")
	public String req06(Team b1) {
		System.out.println("야구단:"+b1.getTname());
		System.out.println("승:"+b1.getWin());
		System.out.println("패:"+b1.getDef());
		
		return "";
	}

}
