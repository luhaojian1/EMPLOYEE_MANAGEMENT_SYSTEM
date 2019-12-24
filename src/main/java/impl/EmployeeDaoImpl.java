package impl;

import java.util.List;
import model.Employee;
import util.EmployeeUtil;

public class EmployeeDaoImpl {

  public List<Employee> findAll() {
    return EmployeeUtil.createEmployees();
  }
}
