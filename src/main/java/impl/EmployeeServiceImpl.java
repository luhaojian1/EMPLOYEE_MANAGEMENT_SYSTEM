package impl;

import java.util.List;
import java.util.stream.Collectors;
import model.Employee;
import util.EmployeeComparator;

public class EmployeeServiceImpl {

  public List<Employee> findSundayEmployees() {
    EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
    List<Employee> employees = employeeDao.findAll();
    return employees.stream().filter(employee -> employee.getAge() >= 18).sorted(new EmployeeComparator())
        .collect(Collectors.toList());
  }
}
