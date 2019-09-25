package com.sample.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sample.springboot.dto.SimpleBbsDto;

@Repository
public class SimpleBbsDao implements ISimpleBbsDao {

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<SimpleBbsDto> listDao() {
		System.out.println("ListDAO()");
		String query = "select * from simple_bbs order by id desc";
		List<SimpleBbsDto> dtos = template.query(query, new BeanPropertyRowMapper<SimpleBbsDto>(SimpleBbsDto.class));
		
		return dtos;
	}

	@Override
	public SimpleBbsDto viewDao(String id) {
		System.out.println("ViewDAO()");
		String query = "select * from simple_bbs where id = " + id;;
		SimpleBbsDto dtos = template.queryForObject(query, new BeanPropertyRowMapper<SimpleBbsDto>(SimpleBbsDto.class));
		
		return dtos;
	}

	@Override
	public int writeDao(String writer, String title, String content) {
		System.out.println("WriteDAO()");
		String query = "insert into simple_bbs(id, writer, title, content)" +
						" values (simple_bbs_seq.nextval, ?, ?, ?)";
		
		return template.update(query, writer, title, content);
	}

	@Override
	public int deleteDao(String id) {
		System.out.println("DeleteDAO()");
		String query = "delete from simple_bbs where id = ?";
		
		return template.update(query, Integer.parseInt(id));
	}

}
