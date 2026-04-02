package com.kedu.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kedu.dao.WorkPlaceDAO;
import com.kedu.dto.WorkPlaceDTO;

@Controller
@RequestMapping("/workplaces")
public class WorkPlaceController {
	
	@Autowired
	WorkPlaceDAO dao = new WorkPlaceDAO();
	
	@RequestMapping("/insert")
	public String insert(WorkPlaceDTO dto, HttpSession session) {
		String memberId = (String) session.getAttribute("loggedInId");
	    dto.setId(memberId);
	    if(dto.getPay_type() == null) dto.setPay_type("시급");
	    
	    if (dto.getWork_start_time() != null && dto.getWork_start_time().isEmpty()) {
	        dto.setWork_start_time(null);
	    }
	    if (dto.getWork_end_time() != null && dto.getWork_end_time().isEmpty()) {
	        dto.setWork_end_time(null);
	    }
	    
		dao.insertToworkpalce(dto);
		
		return "redirect:/salary/calendar";
	}

}
