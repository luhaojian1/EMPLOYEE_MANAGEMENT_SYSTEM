package util;

import java.util.Comparator;
import model.Employee;

public class EmployeeComparator implements Comparator<Employee> {

  @Override
  public int compare(Employee firstEmployee, Employee secondEmployee) {
    return firstEmployee.getName().compareTo(secondEmployee.getName());
  }
}
