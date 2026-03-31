package com.kedu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kedu.dto.WorkPlaceDTO;

public class WorkPlaceDAO {

	@Autowired
	public JdbcTemplate jdbc;
	
	public int insertToworkpalce(WorkPlaceDTO dto) {
		String sql = "insert into workplace values ()";
		return jdbc.update(sql);
	}
	
	
}
