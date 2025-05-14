package com.employee.Service;

import java.util.List;

import org.hibernate.query.Page;

import com.employee.Model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
