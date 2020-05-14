package com.springboot.storedprocedure.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.storedprocedure.model.Employee;
import com.springboot.storedprocedure.repository.Employeedao;
@RestController
@RequestMapping(value = "/api/employee")
public class Employeecontroller {
	@Autowired
	Employeedao edao;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * The role of controller is to map the input request to corresponding request
	 * handler and return the response.
	 * 
	 * @author Jogindrar /
	 * 
	 *         /** Method to fetch all employees from the db.
	 * @return
	 */
	@GetMapping(value = "/getall")
	public Iterable<Employee> getAll() {
		logger.debug("Get all employees.");
		return edao.getAllEmployees();
	}

	/**
	 * Method to fetch employees on the basis of department.
	 * 
	 * @param department
	 * @return
	 */
	@GetMapping(value = "/department/{employee-department}")
	public Iterable<Employee> getEmployeesByDepartment(@PathVariable(name = "employee-department") String department) {
		logger.debug("Getting count for department= {}.", department);
		return edao.getEmployeesByDepartment(department);
	}

	/**
	 * Method to fetch employees count on the basis of designation.
	 * 
	 * @param designation
	 * @return
	 */
	@GetMapping(value = "/count/{employee-designation}")
	public Integer getEmployeeCountByDesignation(@PathVariable(name = "employee-designation") String designation) {
		logger.debug("Getting count for employee-designations= {}.", designation);
		return edao.getEmployeesCountByDesignation(designation);
	}
}