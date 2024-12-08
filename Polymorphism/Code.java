class Animal{
    public void animalSound(){
      System.out.println("Sound of an animal");
    }
  }
  
  class Pig extends Animal{
    @Override
    public void animalSound(){
      System.out.println("Sound of a pig");
    }
  }
  
  class Dog extends Animal{
    @Override
    public void animalSound(){
      System.out.println("Sound of a dog");
    }
  }
  
  class Code{
    public static void main(String[] args){
      Pig pigObj = new Pig();
      Dog dogObj = new Dog();
      Animal animalObj = new Animal();
      animalObj.animalSound();
      pigObj.animalSound();
      dogObj.animalSound();
    }
  }