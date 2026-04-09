package com.kedu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kedu.dto.JobApplyDTO;

public class JobApplyDAO {
	
	@Autowired
	private JdbcTemplate jdbc;

	public int insert(JobApplyDTO dto) {
		String sql = "insert into job_apply values(job_apply_seq.nextval, member_id=?, resume_num=?, job_post_num=?, status=?)";
		return jdbc.update(sql,
				dto.getMember_id(),
				dto.getResume_num(),
				dto.getJob_post_num(),
				dto.getStatus());
	}
	
}
