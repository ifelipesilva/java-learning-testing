package FUNDAMENTALS_JAVA;

import java.util.HashMap;
import java.util.Map;

public class Colections {
  public static void main(String[] args) {
    
    Map<String, Integer> notes = new HashMap<>();
    notes.put("John", 10);
    notes.put("Jane", 8);
    notes.put("Joe", 6);


    for(Map.Entry<String, Integer> entry : notes.entrySet()){
      String key = entry.getKey();
      Integer  value = entry.getValue();

      System.out.println("The key is " + key + " The value is " + value);
    }

  //  var note = notes.get("John");
  //  System.out.println(note);
  }
}
