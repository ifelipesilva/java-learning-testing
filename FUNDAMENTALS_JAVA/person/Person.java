package person;

public class Person {
  //name, age, id
  // type of data
 
  String name;
  int age;
  String id;

  String printPersonData(int indice) {
    return "Name: " + name + "\nAge: " + age + "\nID: " + id + "\nIndice: " + indice;
  }
}
