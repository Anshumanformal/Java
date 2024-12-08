
class RunCode {
    public String reverseString(String input) {
        int n = input.length();
        char[] charArray = new char[n];
        int j=0;
        for(int i=n-1; i>=0; i--){
            charArray[j] = input.charAt(i);
            j++;
        }
        return new String(charArray);
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