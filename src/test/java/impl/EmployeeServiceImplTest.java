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
    assertEquals("MIKE", sundayEmployees.get(0).getName());
  }

  @Test
  public void should_return_sorted_uppercase_employees_when_findSundayEmployees_given_employee_list() {
    // given
    EmployeeServiceImpl service = new EmployeeServiceImpl();

    // when
    List<Employee> employees = service.findSundayEmployees();

    // then
    assertEquals(2, employees.size());
    assertEquals("MIKE", employees.get(0).getName());
    assertEquals("SEPP", employees.get(1).getName());
  }

}