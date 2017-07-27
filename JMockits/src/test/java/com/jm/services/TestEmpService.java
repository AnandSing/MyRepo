package com.jm.services;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestEmpService {

	EmpService service;
	List<String> names;
    String aop;
    String bbb;
	@Test
	public void testGetNames() throws ClassNotFoundException, SQLException {
		service = new EmpService();
		names = service.getNames();
		assertNotNull(names);
		assertTrue(names.contains("SCOTT"));
	}
}
