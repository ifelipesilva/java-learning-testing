package person;

public class Person {
  //name, age, id
  // type of data
 
  private String name;
  private int age;
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  String printPersonData(){
    return "Name: " + name + "\nAge: " + age + "\nID: " + id;
  }
}
