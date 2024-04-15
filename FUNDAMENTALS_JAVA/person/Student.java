package person;

public class Student extends Person {
  
  private String registration;

  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }


  String printPersonData() {
    System.out.println(super.printPersonData());
    return "You're a student.";
  }
}
