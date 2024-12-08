// Recursion to add all of the numbers up to 10.

public class Main{

    public static int addNumber(int n){
      if(n > 0)
        return n + addNumber(n-1);
      else
        return 0;
    }
    
    public static void main(String[] args){
      int n = 10;
      int result = addNumber(n);
      System.out.println(result);
    }
  }