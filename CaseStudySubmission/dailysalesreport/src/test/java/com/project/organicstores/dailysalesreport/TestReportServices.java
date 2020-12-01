package com.project.organicstores.dailysalesreport;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.project.organicstores.dailysalesreport.services.ProductService;
import com.project.organicstores.dailysalesreport.utils.ConnectionUtils;

class TestReportServices {
	
	private Connection connection = ConnectionUtils.getConnectionFromPool();
	
	private ProductService productService = new ProductService(connection);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFindLastKey() {
		String returnValue = productService.findLastKey(1);
		
	}

	@Test
	void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByDate() {
		fail("Not yet implemented");
	}

	@Test
	void testFindTopProductsByMonth() {
		fail("Not yet implemented");
	}

	@Test
	void testCloseConnection() {
		fail("Not yet implemented");
	}

}
