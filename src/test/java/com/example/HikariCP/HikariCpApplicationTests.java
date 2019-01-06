package com.example.HikariCP;

import com.example.HikariCP.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HikariCpApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	DataSource dataSource;

    @Autowired
    UserDao userDao;

	@Test
	public void Test() throws SQLException {
        System.out.println("userDao = " + userDao);
//		System.out.println("dataSource = " + dataSource.getConnection());
	}




}

