import java.util.*;

class Element_with_count_one {

    public List<Integer> itemWithOccurenceOne(List<Integer> input) {
        Map<Integer, Integer> hMapInt = new LinkedHashMap<>();
        List<Integer> result = new ArrayList<>(input.size());
        for(int i=0; i<input.size(); i++){
            if(hMapInt.containsKey(input.get(i)))
                hMapInt.put(input.get(i), hMapInt.get(input.get(i)) + 1);
            else
                hMapInt.put(input.get(i), 1);
        }

        // Iterate over the map and add any item to result which has value == 1
        
        // Method 1 - using Map.Entry to iterate over Map
        // for (Map.Entry<Integer, Integer> entry : hMapInt.entrySet()){
        //     if(entry.getValue() == 1)
        //         result.add(entry.getKey());
        // }

        // Method 2 - Using forEach to iterate over Map
        // hMapInt.forEach((key,value) -> {
        //     if(value == 1)
        //         result.add(key);
        // });
        // return result;

        // Method 3 - Iterating over keySet()
        for(Integer key : hMapInt.keySet()) {
            if(hMapInt.get(key) == 1)
                result.add(key);
        }
        return result;
    }

    public static void main(String[] args) {
        Element_with_count_one obj = new Element_with_count_one();
        List<Integer> input = Arrays.asList(45,21,21,55,78,55,23,67,55);
        List<Integer> output = obj.itemWithOccurenceOne(new ArrayList<>(input));
        System.out.println("\nInput: \n"+input);
        System.out.println("\nOutput: \n"+output);
    }
}