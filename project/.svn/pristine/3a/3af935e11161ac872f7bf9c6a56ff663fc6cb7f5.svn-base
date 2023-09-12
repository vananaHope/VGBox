package springweb.a05_job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backendWeb.a01_dao.A04_PreparedDao;
import backendWeb.z01_vo.Job;

@Service
public class A02_JobService {
	@Autowired
	private A04_PreparedDao dao;
	
	public List<Job> getJobs(Job j){
		if(j.getJob_id()==null) j.setJob_id("");
		
		return dao.getJobs(j.getJob_id());
	}
}
