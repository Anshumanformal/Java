import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort_an_Array_of_Integers_based_on_their_sum_of_digits {
    
    private int sumOfDigits(int a) {
        int sum = 0;
        while (a>0){
            int temp = a%10;
            sum += temp;
            a /= 10;
        }
        return sum;
    }

    // Integer.compare() returns -1,1,0 for all comparison, which is required by the comparator.
    public List<Integer> sortArrayOfIntegersBasedOnSumOfTheDigits(List<Integer> input) {
        input.sort((a,b) -> Integer.compare(sumOfDigits(a), sumOfDigits(b)));
        return input;
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(12, 24, 15, 30));
        Sort_an_Array_of_Integers_based_on_their_sum_of_digits obj = new Sort_an_Array_of_Integers_based_on_their_sum_of_digits();
        List<Integer> output = obj.sortArrayOfIntegersBasedOnSumOfTheDigits(new ArrayList<>(input));
        System.out.println("Input List<Integer> : "+ input);
        System.out.println("Output List<Integer> : "+ output);
    }
}