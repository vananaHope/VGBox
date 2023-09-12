package springweb.a05_job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import backendWeb.z01_vo.Job;

@Controller
public class A01_JobController {
	@Autowired
	private A02_JobService service;
	
	// http://localhost:5090/springweb/jobList.do
	
	@RequestMapping("jobList.do")
	public String jobList(Job j, Model model) {
		
		model.addAttribute("jobList", service.getJobs(j));
		
		return "WEB-INF\\views\\a05_job\\a01_jobList.jsp";
	}
}
