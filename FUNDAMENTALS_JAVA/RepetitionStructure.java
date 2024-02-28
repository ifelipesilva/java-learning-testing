package FUNDAMENTALS_JAVA;

public class RepetitionStructure {
  public static void main(String[] args) {
    
    //while loop loops through a block of code as long as a specified condition is true
    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
    }

    //do-while loop is similar to the while loop, but the condition is tested at the end of the loop
    int j = 0;
    do {
      System.out.println(j);
      j++;
    } while (j < 10);

    //for loop is used when the number of iterations is known
    for (int k = 0; k < 10; k++) {
      System.out.println(k);
    }
    

    //for each loop is used when the number of iterations is unknown
    int[] numbers = {1, 2, 3, 4, 5};
    for (int number : numbers) {
      System.out.println(number);
    }
  }

}
