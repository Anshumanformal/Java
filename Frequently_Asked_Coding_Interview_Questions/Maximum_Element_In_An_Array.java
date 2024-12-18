import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maximum_Element_In_An_Array {

    Integer findMaximumElement(List<Integer> input) {
        // If array is empty
        if(input == null || input.isEmpty())
            return null;
        
        input.sort((a,b) -> b-a);
        return input.get(0);
    }


    public static void main(String[] args) {
        Maximum_Element_In_An_Array obj = new Maximum_Element_In_An_Array();
        List<Integer> input = new ArrayList<>(Arrays.asList(12, 242, 15, 30));
        Integer output = obj.findMaximumElement(new ArrayList<>(input));
        System.out.println("Input List<Integer> : "+ input);
        System.out.println("Output List<Integer> : "+ output);
    }
}
