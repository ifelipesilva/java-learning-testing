package person;

public class Teacher extends Person {
  
  private Double salary;

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }


  String printPersonData() {
    System.out.println(super.printPersonData());
    return "You're a teacher.";
  }

}
