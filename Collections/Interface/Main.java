interface Animal{
    public void animalSound();
    public void sleep();
  }
  
  /*
  
  superclass-subclass -- inheritance -- extends 
  interface  -- implements
  
  */
  
  class Pig implements Animal {
    @Override
    public void animalSound(){
      System.out.println("\nSound of a pig...\n");
    }

    @Override
    public void sleep(){
      System.out.println("\nSound of sleeping...\n");
    }
  }
  
  class Main{
      public static void main(String[] args){
          Pig myPigObj = new Pig();
          myPigObj.animalSound();
          myPigObj.sleep();
      }
  }
  
  