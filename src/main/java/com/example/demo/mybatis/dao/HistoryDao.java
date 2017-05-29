package com.example.demo.mybatis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.mybatis.dto.History;
import com.example.demo.mybatis.dto.HistoryExample;
import com.example.demo.mybatis.mapper.HistoryMapper;

@Repository
public class HistoryDao {
	@Autowired
	private HistoryMapper mapper;
	
	public List<History> selectAll() {
		return mapper.selectByExample(new HistoryExample());
	}
	
	public int insert(History record) {
		return mapper.insertSelective(record);
	}
}
