
import java.util.*;

public class Remove_Duplicates_From_An_Array {

    public List<Integer> remove_duplicate_util(List<Integer> input) {
        // Marking seen item as true in the map
        List<Integer> result = new ArrayList<>(input.size());
        Map<Integer, Boolean> hmap = new HashMap<>();
        for(Integer item : input){
            if(!hmap.containsKey(item)){
                hmap.put(item, true);
                result.add(item);
            }
        }
        return result;
    }

    public boolean contains_duplicate(List<Integer> input) {
        Set<Integer> intSet = new HashSet<>();
         for(Integer item : input) {
            if(!intSet.contains(item))
                intSet.add(item);
         }
         return intSet.size() < input.size();

    }

    public List<Integer> remove_duplicate(List<Integer> input) {
        if(contains_duplicate(input)){
            System.out.println("\nGiven ArrayList contains duplicates");
            return remove_duplicate_util(input);
        }
        else {
            System.out.println("\nGiven ArrayList doesn't contain duplicates");
            return input;
        }
    }

    public static void main(String[] args){
        Remove_Duplicates_From_An_Array solution = new Remove_Duplicates_From_An_Array();
        List<Integer> input = new ArrayList<>(Arrays.asList(23,65,45,23,65,40));
        System.out.println("\nGiven List<Integer> : "+input);
        System.out.println("\nOutput List<Integer>: "+solution.remove_duplicate(new ArrayList<>(input)));
    }
}
