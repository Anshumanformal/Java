// Java HashMap
import java.util.HashMap;

public class Main{
    public static void main (String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        
        // Access an item
        String city = capitalCities.get("England");
        System.out.println("\nCity: " + city);
        
        // Remove an item
        String removedCity = capitalCities.remove("England");
        System.out.println("\nremovedCity: " + removedCity);
        
        System.out.println("\n");
        // Loop to get the keys
        for(String i : capitalCities.keySet())
            System.out.println(i);
        
        System.out.println("\n");
        // Loop to get the values
        for(String i : capitalCities.values())
            System.out.println(i);
    }    
}
