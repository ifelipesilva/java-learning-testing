package fundamentals;
import java.util.HashSet;

public class CollectionHashSet {
  public static void main(String[] args) {
    HashSet<Integer> number = new HashSet<>();

    number.add(10);
    number.add(20);
    number.add(30);
    number.add(40);
    number.add(50);

    //number.remove(10)

    // for (Integer i : number) {
    //   System.out.println(i);
    // }

    System.out.println(number.contains(10));
    System.out.println(number.size());
  
  }
}
