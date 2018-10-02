package com.ict.erp;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {

	@Autowired
	private DataSource ds;

	@Autowired
	private SqlSessionFactory ssf;
	
	@Autowired
	private SqlSession ss;
	
	
	@Test
	public void test() {
		try {
			Connection con = ds.getConnection();
			System.out.println("테스트완료");
		} catch (SQLException e) {
			e.printStackTrace();

		}
		
	}
}