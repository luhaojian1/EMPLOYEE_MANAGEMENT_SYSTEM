package impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import model.Employee;
import org.junit.jupiter.api.Test;

class EmployeeServiceImplTest {

  @Test
  public void should_return_employees_elder_than_18_given_an_employee_list() {
    //given
    EmployeeServiceImpl e1mployeeservice = new EmployeeServiceImpl();

    //when
    List<Employee> sundayEmployees = e1mployeeservice.findSundayEmployees();

    //then
    assertEquals(2, sundayEmployees.size());
  }

  @Test
  public void should_return_sort_employees_given_an_employee_list() {
    //given
    EmployeeServiceImpl e1mployeeservice = new EmployeeServiceImpl();

    //when
    List<Employee> sundayEmployees = e1mployeeservice.findSundayEmployees();

    //then
    assertEquals(2, sundayEmployees.size());
    assertEquals("Mike", sundayEmployees.get(0).getName());
  }
}