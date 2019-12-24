package util;

import java.util.ArrayList;
import java.util.List;
import model.Employee;

public class EmployeeUtil {
  public static List<Employee> createEmployees(){
    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(createEmployee("Max",17));
    employeeList.add(createEmployee("Sepp",18));
    employeeList.add(createEmployee("Nina",15));
    employeeList.add(createEmployee("Mike",51));
    return employeeList;
  }

  private static Employee createEmployee(String name, Integer age) {
    Employee employee = new Employee();
    employee.setName(name);
    employee.setAge(age);
    return employee;
  }
}
