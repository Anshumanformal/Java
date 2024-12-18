import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_list_of_strings_based_on_length {

    List<String> sortListOfStrings(List<String> input) {
        // If array is empty
        if(input == null || input.isEmpty())
            return null;
        
        Collections.sort(input, (str1, str2) -> {
            // return Integer.compare(str1.length(), str2.length());
            // or we can also write manually, like,
            if(str1.length() < str2.length()) return -1;
            else if (str1.length() > str2.length()) return 1;
            else return 0;
        });
        return new ArrayList<>(input);
    }

    public static void main(String[] args) {
        Sort_list_of_strings_based_on_length obj = new Sort_list_of_strings_based_on_length();
        List<String> input = new ArrayList<>(Arrays.asList("apple", "kiwi", "banana", "cherry"));
        List<String> output = obj.sortListOfStrings(new ArrayList<>(input));
        System.out.println("\nInput List<String> : "+ input);
        System.out.println("\nOutput List<String> : "+ output);
    }
}
