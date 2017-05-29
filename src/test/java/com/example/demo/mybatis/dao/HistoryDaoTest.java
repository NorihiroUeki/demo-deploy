package com.example.demo.mybatis.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.mybatis.dto.History;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource("/test.properties")
public class HistoryDaoTest {
	@Autowired
	HistoryDao dao;
	
    @Rule
    public TestName testName = new TestName();

	@Test
	public void 全ての履歴データが取得できる() {
		List<History> result =  dao.selectAll();
		assertEquals(0, result.size());
	}
	
	@Test
	public void 一件の登録が正常にできる() {
		History record = new History();
		record.setValue("登録");
		int result = dao.insert(record);
		assertEquals(1, result);
	}

}
