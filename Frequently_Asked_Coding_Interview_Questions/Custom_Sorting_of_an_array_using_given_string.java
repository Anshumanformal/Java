import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Custom_Sorting_of_an_array_using_given_string {
    
    /**
     * Steps:

        Map the characters in the sortOrder to their indices.
        Create a comparator that compares two elements in abc based on the order defined by sortOrder.
        Sort the array using the comparator.
     */
    
    public List<String> sortArrayUsingComparator(List<String> input, String sortOrder) {
        // 1. Map the characters in the sortOrder to their indices.
        Map<Character, Integer> hmap = new HashMap<>();
        for(int i=0; i<sortOrder.length(); i++) {
            hmap.put(sortOrder.charAt(i),i);
        }
        // 2. Create a comparator that compares two elements in abc based on the order defined by sortOrder.
        Comparator<String> customComparatorUtil = (str1, str2) -> {
            char firstChar1 = str1.toLowerCase().charAt(0);
            char firstChar2 = str2.toLowerCase().charAt(0);

            Integer order1 = hmap.get(firstChar1);
            Integer order2 = hmap.get(firstChar2);
            if (order1 == null) order1 = Integer.MAX_VALUE;
            if (order2 == null) order2 = Integer.MAX_VALUE;

            return Integer.compare(order1, order2);
        };
        input.sort(customComparatorUtil);
        return new ArrayList<>(input);
    }


    public static void main (String[] args) {
        Custom_Sorting_of_an_array_using_given_string obj = new Custom_Sorting_of_an_array_using_given_string();
        List<String> input = new ArrayList<>(Arrays.asList("apple", "mango", "grapes", "oranges", "banana"));
        String sortOrder = "obgam";
        // Always call by reference is done in Java. Below am doing call by value, to print the previous and new values
        // explicitely.
        List<String> output = obj.sortArrayUsingComparator(new ArrayList<>(input), sortOrder);
        System.out.println("Input Array of String : "+ input);
        System.out.println("Comparator String : "+ sortOrder);
        System.out.println("Output Array of String : "+ output);

    }
}

