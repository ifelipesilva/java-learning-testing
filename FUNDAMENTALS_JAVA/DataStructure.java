package FUNDAMENTALS_JAVA;

import java.util.ArrayList;
import java.util.List;

public class DataStructure {
  public static void main(String[] args) {
      List<String> names = new ArrayList<>();
      names.add("John");
      names.add("Jane");
      names.add("Joe");

     // System.out.println(names.get(1));

      // for( String name : names) {
      //     System.out.println("The name is " + name);
      // }

      names.forEach(name -> System.out.println("The name is " + name));
  }
}
