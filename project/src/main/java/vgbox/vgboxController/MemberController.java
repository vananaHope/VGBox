package vgbox.vgboxController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vgbox.vgboxDB.VO.Member;
import vgbox.vgboxDB.VO.Seller;
import vgbox.vgboxService.MemberService;

@Controller
public class MemberController {
	@Autowired
	public MemberService service;
	
	@RequestMapping("main.do")
	public String main() {
	        return "WEB-INF/vgbox_views/jsp/main.jsp";
	}

	    
	    @RequestMapping("checkId.do")
	    @ResponseBody
	    public String checkId(@RequestParam(value = "choice", defaultValue = "") String choice, Member m, Seller s) {
	    	
	    	String checkid = "";
	    	
	    	if(choice.equals("user")) {
	    		checkid = service.checkID(choice, m.getId());
	   
	    	}else if (choice.equals("seller")){
	    		checkid = service.checkID(choice, s.getSeller_id());
	    	}
	    	
	    	return checkid;
	    }
	    
	 // http://localhost:5088/project/memReg.do
	    @RequestMapping("memReg.do")
	    public String memReg(@RequestParam(value = "choice", defaultValue = "") String choice, Member m, Seller s, Model d) {
	        
	       d.addAttribute("regYN", service.join(choice, m, s));
     
	       return "WEB-INF\\views\\login_join\\register.jsp";
	    }
	    
	    @RequestMapping("memLogin.do")
	    public String memLogin(HttpServletRequest request, @RequestParam(value = "choice", defaultValue = "") String choice, Member m, Seller s, Model d) {
	    	HttpSession session = request.getSession();
	    	
	    	
	    	return "";
	    }
}
	    /*
	    private void registerUser(Member m, Model d) {
	        if (!m.getId().equals("") && !m.getPassword().equals("")) {
	            dao.join(m);
	            d.addAttribute("proc", "user");
	        }
	    }

	    private void registerSeller(Seller s, Model d) {
	        if (!s.getId().equals("")) {
	            dao.sellerJoin(s);
	            d.addAttribute("proc", "seller");
	        }
	    }

	    // Method for user login
	    private void loginUser(Member m, HttpSession session, Model d) {
	        Member mem = dao.login(m.getId(), m.getPassword());
	        if (mem != null) {
	            d.addAttribute("login", "user");
	            session.setAttribute("mem", mem);
	        } else {
	            d.addAttribute("login", "fail");
	        }
	    }

	    // Method for seller login
	    private void loginSeller(Seller s, HttpSession session, Model d) {
	        Seller sell = dao.loginS(s.getId(), s.getPassword());
	        if (sell != null) {
	            d.addAttribute("login", "seller");
	            session.setAttribute("mem", sell);
	        } else {
	            d.addAttribute("login", "fail");
	        }
	    }
	}*/
	


		
