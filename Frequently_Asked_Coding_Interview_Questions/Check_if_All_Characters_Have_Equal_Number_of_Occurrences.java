
import java.util.HashMap;
import java.util.Map;

public class Check_if_All_Characters_Have_Equal_Number_of_Occurrences {
    public boolean areOccurencesEqual(String s) {
        // Map to store character frequencies
        Map<Character, Integer> characterCountMap = new HashMap<>();

        // Insert the character count into the map
        for(char c : s.toCharArray()){
            // If character is already in the map, then increment its count
            if(characterCountMap.containsKey(c)){
               characterCountMap.put(c, characterCountMap.get(c) + 1); 
            }
            else
            // If the character doesn't exist, add it with count 1
                characterCountMap.put(c,1);
        }

        // Get the expected count from the first entry (or any entry) in the map
        int expectedCount = characterCountMap.values().iterator().next();
        
        // Iterate through the map and check if all character counts are equal
        for(int count : characterCountMap.values()) {
            if(count != expectedCount)
                return false;
        }
        return true;

    }

    public static void main(String[] args){
        Check_if_All_Characters_Have_Equal_Number_of_Occurrences solution = new Check_if_All_Characters_Have_Equal_Number_of_Occurrences();
        String input = "abc";
        System.out.println("\nGiven String : "+input);
        System.out.println("\nOutput : "+solution.areOccurencesEqual(input));
    }
}
