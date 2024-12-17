import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Remove_Duplicates_From_A_String {

    public String remove_duplicate_util(String input) {
        StringBuilder result = new StringBuilder();
        Map<Character, Boolean> hmap = new HashMap<>();
        for(char ch : input.toCharArray()){
            if(!hmap.containsKey(ch)){
                hmap.put(ch, true);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public boolean contains_duplicate(String s) {
         Set<Character> charSet = new HashSet<>();
         for(char ch : s.toCharArray()) {
            if(!charSet.contains(ch))
                charSet.add(ch);
         }
        return charSet.size() < s.length();

    }

    public String remove_duplicate(String input) {
        if(contains_duplicate(input)){
            System.out.println("\nGiven string contains duplicates");
            return remove_duplicate_util(input);
        }
        else {
            System.out.println("\nGiven string doesn't contain duplicates");
            return input;
        }
    }

    public static void main(String[] args){
        Remove_Duplicates_From_A_String solution = new Remove_Duplicates_From_A_String();
        String input = "abac";
        System.out.println("\nGiven String : "+input);
        System.out.println("\nOutput : "+solution.remove_duplicate(input));
    }
}
