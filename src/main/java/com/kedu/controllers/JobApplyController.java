package com.kedu.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kedu.dao.JobApplyDAO;
import com.kedu.dao.ResumeDAO;
import com.kedu.dto.ResumeDTO;

@Controller
@RequestMapping("/jobapplys")
public class JobApplyController {
	
	@Autowired
	public JobApplyDAO dao;
	
	@Autowired
	public ResumeDAO rdao;
	
	@RequestMapping("/insert")
	public String insert(int jobPostNum, HttpSession session, Model model, RedirectAttributes rattr) {
		String loginId = (String)session.getAttribute("loginId");
		if (dao.existsApply(loginId, jobPostNum)) {
			rattr.addFlashAttribute("error", "이미 지원하신 공고입니다.");
	        return "redirect:/jobposts/jobpost";
	    }
		
		int resumeNum = rdao.getPrimaryResume(loginId);
		
		if (resumeNum == 0) {
		    rattr.addFlashAttribute("resume", "먼저 이력서를 작성해주세요! 이력서 작성으로 이동합니다.");
		    return "redirect:/jobposts/jobpost";
		}
		
		dao.insert(loginId, resumeNum, jobPostNum);
		rattr.addFlashAttribute("message", "지원이 완료되었습니다.");
		
		return "redirect:/jobposts/jobpost";
	}
	
//	@RequestMapping("/getMyResumes")
//	public String @ResponseBody // 페이지 이동이 아니라 데이터를 보내야 하므로 필수!
//	@RequestMapping("/getMyResumes")
//	public List<ResumeDTO> getMyResumes(HttpSession session) {
//	    String loginId = (String)session.getAttribute("loginId");
//	    // 해당 사용자의 모든 이력서를 가져오는 DAO 메서드 호출
//	    return rdao.selectMyResumes(loginId); 
//	}() {
//		
//	}
}
