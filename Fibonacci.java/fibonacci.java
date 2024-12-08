// public class fibonacci{

//   // 0,1,1,2,3,5,8,13,21...
//   public static void main(String[] args){
//     // fibonacci series using 'for' loop
//     int n = 10;
//     int firstTerm = 0, secondTerm = 1;
//     System.out.println("Fibonacci Series till "+ n + "terms : ");

//     for(int i=0; i<n; i++){
//        System.out.print(firstTerm + ", ");
        
//        int nextTerm = firstTerm + secondTerm;
//         firstTerm = secondTerm;
//         secondTerm = nextTerm;
//     }
    
//   }
// }

public class fibonacci{

    public static int fibonacciRecursion(int n){
      if(n == 0)
          return 0;
      if(n == 1 || n == 2)
          return 1;
  
      return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }
    
    public static void main(String[] args){
       int n = 10;
      System.out.println("Fibonacci Series of "+ n + " numbers");
      for(int i=0; i<n; i++)
        System.out.println(fibonacciRecursion(i)+ ", ");
    }
  }