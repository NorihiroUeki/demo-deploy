package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mybatis.dao.HistoryDao;
import com.example.demo.mybatis.dto.History;

@Service
public class HistoryService {
	@Autowired
	private HistoryDao dao;

	public int createHistory(History history) {
		return dao.insert(history);
	}

	public List<History> getHistories() {
		return dao.selectAll();
	}
}
