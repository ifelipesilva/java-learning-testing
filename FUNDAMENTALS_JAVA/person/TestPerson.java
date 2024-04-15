package person;

public class TestPerson {

  public static void main(String[] args) {
    Teacher teacher = new Teacher();
    teacher.setId( "444444");
    teacher.setName("Felipe");
    teacher.setAge(20);
    teacher.setSalary(1000.0);

    

    
    System.out.println(teacher.printPersonData());

    Student student = new Student();
    student.setId( "555555");
    student.setName("Maria");
    student.setAge(30);
    student.setRegistration("123456");
    
    System.out.println(student.printPersonData());


  }
}
