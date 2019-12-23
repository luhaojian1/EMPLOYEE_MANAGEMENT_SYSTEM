package impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import model.Employee;
import org.junit.jupiter.api.Test;
import util.EmployeeUtil;

public class EmployeeManagementTest {

  @Test
  public void should_return_employees_elder_than_18_given_an_employee_list() {
    //given
    List<Employee> employees = EmployeeUtil.createEmployees();
    EmployeeServiceImpl e1mployeeservice = new EmployeeServiceImpl();

    //when
    List<Employee> sundayEmployees = e1mployeeservice.findSundayEmployees(employees);

    //then
    assertEquals(sundayEmployees.size(), 2);
  }
}
