package assignments;

import java.util.Scanner;

/**
 *
 * @author Michala
 */


public class RomanToInteger {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        int number;
        System.out.print("Enter a roman numeral:\n->");
        userInput = scnr.nextLine();
        number = romanToInt(userInput);
        System.out.println(userInput + " is equal to: " + number);
    }
    
    public static int romanToInt(String romanNumeral) {
        int count = 0;
        for (int i=0; i<romanNumeral.length(); i++) {
            int current = getRomanValue(romanNumeral.substring(i, i+1));
            int next = 0;
            if (i+1 < romanNumeral.length()) {
                next = getRomanValue(romanNumeral.substring((i+1), i+2));
        }
            if (current < next) {
                count -= current;
            }
            else {
                count += current;
            }
        }
        return count;
    }
    
    private static int getRomanValue(String s) {
        int number;
        number = switch (s) {
            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            case "M" -> 1000;
            default -> 0;
        };
        return number;
    }
}
