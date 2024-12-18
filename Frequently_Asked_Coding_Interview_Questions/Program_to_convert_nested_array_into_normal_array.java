import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_to_convert_nested_array_into_normal_array {

    public static List<Object> nestedToArrayList(List<Object> input, List<Object> flattenedArray) {
        // [[3,2], 23, [11,25,[5,5]], 50]
        // 3
        // [3,5]
        for(Object item : input) {
            if(item instanceof List<?>){
                nestedToArrayList((List<Object>) item, flattenedArray);
            }
            else if (item instanceof Integer || 
                    item instanceof String  || 
                    item instanceof Character) {
                flattenedArray.add(item);
            }
        }
        return flattenedArray;
    }

    public static void main(String[] args) {

        List<Object> input = new ArrayList<>(Arrays.asList(
            Arrays.asList(3,2), 
            23, 
            Arrays.asList("abc",25,
                Arrays.asList(5,'a')),
            50));
        List<Object> flattenedArray = new ArrayList<>();
        List<Object> output = nestedToArrayList(new ArrayList<>(input), flattenedArray);
        System.out.println("\nInput List<Object> : "+ input);
        System.out.println("\nOutput List<Object> : "+ output);
    }
    
}
