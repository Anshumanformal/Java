// Java Threads
// Threads can be used to perform complicated tasks in the background without interrupting the main program.

// 1st method
public class Main extends Thread{
    public static void main(String[] args){
        Main myThreadObj = new Main();
        myThreadObj.start();
        System.out.println("Thread code started, using the thread class");
    }
    
    public void run(){
        System.out.println("This code is running on a thread");
    }
}

// 2nd method
// Since Runnable is an interface, we have to implment it in the main class

// public class Main implements Runnable{
//     public static void main(String[] args){
//         Main myRunnableThreadObj = new Main();  // create main method object
//         Thread thread = new Thread(myRunnableThreadObj);  // create thread object and pass main method object in it
//         thread.start();
//         System.out.println("Thread code started on runnable interface");
//     }
    
//     public void run(){
//         System.out.println("This code is running on a thread, using the Runnable interface");
//     }
// } 