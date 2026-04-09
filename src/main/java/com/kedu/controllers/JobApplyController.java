package com.kedu.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kedu.dao.JobApplyDAO;

@Controller
@RequestMapping("/jobapplys")
public class JobApplyController {
	
	@Autowired
	public JobApplyDAO dao;
	
	@RequestMapping("/insert")
	public String insert(int jobPostNum, HttpSession session, Model model) {
//		int resumeNum = resumeDao.getPrimaryResume(loginId);
		
		return "redirect:/jobposts/jobpost";
	}
}
