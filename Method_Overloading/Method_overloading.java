// Method overloading
public class Method_overloading{

    public static int plusMethod(int x, int y){
      return x+y;
    }
    public static double plusMethod(double x, double y){
      return x+y;
    }
    
    public static void main(String[] args){
      System.out.println(plusMethod(2,3));
      System.out.println(plusMethod(2.5,3.5));
      
    }
  }