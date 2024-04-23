import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
// Class RomanNumeral is used for converting Roman numeral strings to their integer value.
public class RomanNumeral {
    // A map to hold the Roman characters and their corresponding integer values.
    private static final Map<Character, Integer> map;
// Static initializer to populate the map with Roman numerals and their integer equivalents.
    static {
        Map<Character, Integer> tempMap = new HashMap<>();
        tempMap.put('I', 1);
        tempMap.put('V', 5);
        tempMap.put('X', 10);
        tempMap.put('L', 50);
        tempMap.put('C', 100);
        tempMap.put('D', 500);
        tempMap.put('M', 1000);
        map = Collections.unmodifiableMap(tempMap);
    }
// Method to convert a Roman numeral string to an integer.
    public int romanToInt(String s) {
        int convertedNumber = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));
            int next = i + 1 < s.length() ? map.get(s.charAt(i + 1)) : 0;
            if (currentNumber >= next) {
                convertedNumber += currentNumber;
            } else {
                convertedNumber -= currentNumber;
            }
        }
        return convertedNumber;
    }
    public static void main(String[] args) {
        RomanNumeral romanConverter = new RomanNumeral();
        // Convert the Roman numeral "V" to its integer value and print the result.
        int result = romanConverter.romanToInt("V");
        System.out.println(result);// Output will be 5
    }
}
