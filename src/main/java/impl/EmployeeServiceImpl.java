package impl;

import java.util.List;
import java.util.stream.Collectors;
import model.Employee;

public class EmployeeServiceImpl {

  public List<Employee> findSundayEmployees(List<Employee> employees) {
    List<Employee> sundayEmployees = employees.stream().filter(employee -> employee.getAge() >= 18).collect(Collectors.toList());
    return sundayEmployees;
  }
}
