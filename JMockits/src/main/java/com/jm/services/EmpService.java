package com.jm.services;

import java.sql.SQLException;
import java.util.List;

import com.jm.dao.EmployeeDto;

public class EmpService {

	public List<String> getNames() throws ClassNotFoundException, SQLException {
		System.out.println("Serviecs class");
		EmployeeDto dto = new EmployeeDto();
		List<String> names = dto.getEmpNames();
		return names;
	}
}
