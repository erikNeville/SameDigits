/*
 * Erik Neville
 */
package NumbersGame;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Erik Neville <erikeneville@gmail.com>
 */
public class NumbersGame {

    static boolean isRepeat(int n) {
        
        // Create a String to store each number
        String str;
        boolean mult = false;
        
        // Iterating through the list
        for (int i = 1; i <= n; i++) {
            
            // set str to the value of the integer
            str = String.valueOf(i);
            
            // detect how many digits are in the integer
            int strlen = str.length();

            // true or false based on matching digits in different positions
            switch (strlen) {
                case 1:
                    mult = false;
                    break;
                case 2:
                    mult = str.charAt(0) == str.charAt(1);
                    break;
                case 3:
                    mult = str.charAt(0) == str.charAt(1) &&
                            str.charAt(1) == str.charAt(2) &&
                            str.charAt(0) == str.charAt(2);
                    break;
                case 4:
                    mult = str.charAt(0) == str.charAt(1) &&
                            str.charAt(0) == str.charAt(2) &&
                            str.charAt(0) == str.charAt(3) &&
                            str.charAt(1) == str.charAt(2) &&
                            str.charAt(1) == str.charAt(3) &&
                            str.charAt(2) == str.charAt(3);
                    break;
                default:
                    mult = false;
            }
        }
        return mult;
    }

    public static void main(String[] args) {
        int n = 9999;

        for (int i = 1; i <= n; i++) {
            if (isRepeat(i) == true) {
                System.out.println(i + " is a repeat");
            } else {
                System.out.println(i);
            }
        }
    }
}


