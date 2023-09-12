package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A02_CallController {
	// http://localhost:5088/springweb/callCtrl1.do
	@RequestMapping("/callCtrl1.do")
	public String start(Model d) {
		
		d.addAttribute("greet", "hello spring");
		
		return "WEB-INF\\views\\a02_callView.jsp";
	}
}
