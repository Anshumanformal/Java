
class RunCode {
    // Using a temporary ArrayList
    // public String reverseString(String input) {
    //     int n = input.length();
    //     char[] charArray = new char[n];
    //     int j=0;
    //     for(int i=n-1; i>=0; i--){
    //         charArray[j] = input.charAt(i);
    //         j++;
    //     }
    //     return new String(charArray);
    // }

    // Using two pointer approach
    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        int left = 0;
        int right = sb.length()-1;

        while(left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left+=1;
            right-=1;
        }
        return sb.toString();
    }
}


class Reverse_String {
    public static void main (String[] args) {
        String input = "hello";
        RunCode reverser = new RunCode();
        String output = reverser.reverseString(input);
        System.out.println("Input String : "+ input);
        System.out.println("Output String : "+ output);
    }
}