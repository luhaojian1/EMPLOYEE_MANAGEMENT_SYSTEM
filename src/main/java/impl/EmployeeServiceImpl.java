package impl;

import java.util.List;
import java.util.stream.Collectors;
import model.Employee;

public class EmployeeServiceImpl {

  public List<Employee> findSundayEmployees() {
    EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
    List<Employee> employees = employeeDao.findAll();
    return employees.stream().filter(employee -> employee.getAge() >= 18)
            .sorted(Employee::compareTo).map(employee -> {
              employee.setName(employee.getName().toUpperCase());
              return employee;
            }).collect(Collectors.toList());
  }
}
