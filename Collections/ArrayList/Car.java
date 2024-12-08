// Java ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class Car{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("volvo");
        cars.add("bmw");
        cars.add("Ford");
        cars.add("Mazda");
        // 1st way
        System.out.println("cars: "+ cars);
        
        // 2nd way
        for (String i : cars)
            System.out.println(i);
            
        // Access an item
        String myCar = cars.get(1);
        System.out.println("\nAccess an item: " + myCar);
        
        // Change an item
        cars.set(0, "ferrari");
        System.out.println("\nChange an item: " + cars);
        
        // Remove an item
        cars.remove(0);
        System.out.println("\nRemove an item: " + cars);
        
        // To remove all elements of the ArrayList
        // cars.clear();
        
        // To find the size of ArrayList
        int size = cars.size();
        System.out.println("\nSize of ArrayList: " + size);
        
        // Loop through the ArrayList
        int n = cars.size();
        
        for(int i=0; i<n; i++){
            System.out.println(cars.get(i));
        }
        
        // Sort the ArrayList
        Collections.sort(cars);
        System.out.println(cars);
    }
}