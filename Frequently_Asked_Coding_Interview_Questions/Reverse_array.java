
import java.util.*;


class RunCode {
    // Using a temporary ArrayList
    // public List<Integer> reverseArray(List<Integer> input) {
    //     int n = input.size();
    //     List<Integer> result = new ArrayList<>(n);
    //     int j=0;
    //     for(int i=n-1; i>=0; i--){
    //         result.add(input.get(i));
    //         j++;
    //     }
    //     return new ArrayList<>(result);
    // }

    // Using two pointer approach
    public List<Integer> reverseArray(List<Integer> input) {
        int left = 0;
        int right = input.size()-1;

        while(left < right) {
            Integer temp = input.get(left);
            input.set(left, input.get(right));
            input.set(right, temp);
            left+=1;
            right-=1;
        }
        return new ArrayList<>(input);
    }
}


class Reverse_array {
    public static void main (String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(12, 24, 15, 30));
        RunCode reverser = new RunCode();
        List<Integer> output = reverser.reverseArray(new ArrayList<>(input));
        System.out.println("Input List<Integer> : "+ input);
        System.out.println("Output List<Integer> : "+ output);
    }
}