package com.kedu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kedu.dto.WorkPlaceDTO;
@Repository
public class WorkPlaceDAO {

	@Autowired
	public JdbcTemplate jdbc;
	
	public int insertToworkpalce(WorkPlaceDTO dto) {
		String sql = "insert into workplace values ()";
		return jdbc.update(sql);
	}
	
	
}
