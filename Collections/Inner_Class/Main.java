class OuterClass{
    int x = 10;
    class InnerClass{
      int y = 5;
    }
  }
  
  public class Main{
    public static void main(String[] args){
      OuterClass outerClassObj = new OuterClass();
      OuterClass.InnerClass innerClassObj = outerClassObj.new InnerClass();
      System.out.println(outerClassObj.x + " " + innerClassObj.y);
    }
  }