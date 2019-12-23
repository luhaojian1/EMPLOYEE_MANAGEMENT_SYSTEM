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
    assertEquals(2, sundayEmployees.size());
  }

  @Test
  public void should_return_sort_employees_given_an_employee_list() {
    //given
    List<Employee> employees = EmployeeUtil.createEmployees();
    EmployeeServiceImpl e1mployeeservice = new EmployeeServiceImpl();

    //when
    List<Employee> sundayEmployees = e1mployeeservice.findSundayEmployees(employees);

    //then
    assertEquals(2, sundayEmployees.size());
    assertEquals("Mike", sundayEmployees.get(0).getName());
  }
}
