// Lambda expression in Java
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(9);

    // Print the values of the ArrayList
    numbers.forEach((i) -> { System.out.println(i); });
  }
}