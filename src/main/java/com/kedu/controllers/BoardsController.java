package com.kedu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kedu.dao.BoardsDAO;
import com.kedu.dto.BoardsDTO;

@Controller
@RequestMapping("/boards")
public class BoardsController {
	
	@Autowired
	private BoardsDAO dao;
	

	@RequestMapping("/mainboard_list")
	public String toMainBoard() {
		return "boards/mainboard/mainboard_list";
	}
	
	@RequestMapping("/jobpost")
	public String jobpost() {
		return "boards/jobpost";
	}
	
	@RequestMapping("/toWrite")
	public String toWrite() {
		return "boards/write";
	}
	@RequestMapping("/write")
	public String write(BoardsDTO dto) {
		System.out.println(dto.getContent() + " : " + dto.getCategory() );
		return "redirect:/boards/mainboard_list";
	}
}
