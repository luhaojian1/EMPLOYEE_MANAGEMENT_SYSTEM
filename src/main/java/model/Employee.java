package model;

public class Employee implements Comparable<Employee> {
  private String name;
  private Integer age;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }


  @Override
  public int compareTo(Employee employee) {
    return this.name.compareTo(employee.name);
  }
}
