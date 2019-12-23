package impl;

import java.util.List;
import java.util.stream.Collectors;
import model.Employee;
import util.EmployeeComparator;

public class EmployeeServiceImpl {

  public List<Employee> findSundayEmployees(List<Employee> employees) {
    List<Employee> sundayEmployees = employees.stream().filter(employee -> employee.getAge() >= 18).collect(Collectors.toList());
    sundayEmployees.sort(new EmployeeComparator());
    return sundayEmployees;
  }
}
