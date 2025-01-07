public class TypeConversion {
    
    public static void IntegerToStringOrCharacter(int integer) {
        // Convert the integer to string
        String intToStr = Integer.toString(integer);
        System.out.println("IntegerToStringOrCharacter -> Output (String): " + intToStr); 
        // Get the str.get(0) from the string or simply
        // print the string
        char intToChar = intToStr.charAt(0);
        System.out.println("IntegerToStringOrCharacter -> Output (Character): " + intToChar); 
    }

    public static void CharacterToInteger(char abc) {
        int result = (int)(abc);
        System.out.println("CharacterToInteger -> Output: " + result);
    }

    public static void StringToInteger(String str) {
        try {
            int result = Integer.parseInt(str);
            System.out.println("StringToInteger -> Output: " + result);
        } catch (Exception e) {
            System.out.println("StringToInteger -> Invalid input: " + e);
        }
    }

    public static void DoubleToStringOrCharacter(double value) {
        String doubleToStr = Double.toString(value);
        System.out.println("DoubleToStringOrCharacter -> Output (String): " + doubleToStr);
        char doubleToChar = doubleToStr.charAt(0);
        System.out.println("DoubleToStringOrCharacter -> Output (Character): " + doubleToChar);
    }

    public static void StringToDouble(String value) {
        try {
            double strToDouble = Double.parseDouble(value);
            System.out.println("StringToDouble -> Output: " + strToDouble);
        } catch (Exception e) {
            System.out.println("StringToDouble -> Invalid input: " + e);
        }
    }

    public static void FloatToStringOrCharacter(float value) {
        String floatToStr = Float.toString(value);
        System.out.println("FloatToStringOrCharacter -> Output (String): " + floatToStr);
        char floatToChar = floatToStr.charAt(0);
        System.out.println("FloatToStringOrCharacter -> Output (Character): " + floatToChar);
    }

    public static void LongToStringOrCharacter(long value) {
        String longToStr = Long.toString(value);
        System.out.println("LongToStringOrCharacter -> Output (String): " + longToStr);
        char longToChar = longToStr.charAt(0);
        System.out.println("LongToStringOrCharacter -> Output (Character): " + longToChar);
    }

    public static void FloatToInteger(float value) {
        int floatToInt = (int) value;
        System.out.println("FloatToInteger -> Output: " + floatToInt);
    }

    public static void LongToInteger(long value) {
        int longToInt = (int) value;
        System.out.println("LongToInteger -> Output: " + longToInt);
    }

    public static void main(String[] args) {
        int integer = 123;
        IntegerToStringOrCharacter(integer);
        char abc = 'q';
        CharacterToInteger(abc);
        String str1 = "sampleString";
        String str2 = "123";
        StringToInteger(str1); // This will print an error message
        StringToInteger(str2); // This will print 123
        double doubleValue = 123.45; 
        DoubleToStringOrCharacter(doubleValue);
        String str3 = "abc";
        StringToDouble(str3); // This will print an error message
        String str4 = "123.45";
        StringToDouble(str4); // This will print 123.45
        float floatValue = 123.45f;
        FloatToStringOrCharacter(floatValue);
        FloatToInteger(floatValue);
        long longValue = 123456789L;
        LongToStringOrCharacter(longValue);
        LongToInteger(longValue);
    }
}
