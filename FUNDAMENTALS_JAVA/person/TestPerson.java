package person;

public class TestPerson {

  public static void main(String[] args) {
    Person person1 = new Person();
    person1.id = "444444";
    person1.name = "Felipe";
    person1.age = 28;
    
    System.out.println(person1.printPersonData( 0));

    Person person2 = new Person();
    person2.id = "555555";
    person2.name = "Maria";
    person2.age = 30;
    
    System.out.println(person2.printPersonData(1));


  }
}
