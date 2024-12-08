// Java Threads
// Threads can be used to perform complicated tasks in the background without interrupting the main program.
// Using isAlive() to to prevent concurrency problems

public class Main extends Thread{
    public static int amount = 0;
    public static void main(String[] args){
        Main thread = new Main();
        thread.start();
        while(thread.isAlive()){
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
        
    }
    
    public void run(){
        amount++;
    }
}
