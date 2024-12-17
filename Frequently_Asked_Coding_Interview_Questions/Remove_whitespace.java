
class RunCode {
    public String removeWhiteSpace(String input) {
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                output.append(c);
            }
        }
        return output.toString();
    }
}


class Remove_whitespace {
    public static void main (String[] args) {
        String input = "he l lo";
        RunCode runCode = new RunCode();
        String output = runCode.removeWhiteSpace(input);
        System.out.println("Input String : "+ input);
        System.out.println("Output String : "+ output);
    }
}