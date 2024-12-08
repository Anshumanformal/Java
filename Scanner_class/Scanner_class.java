import java.util.*;

public class Scanner_Class{
  public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter your username");
    String username = myObj.nextLine();
    System.out.println("Username is: "+ username);
  }
}