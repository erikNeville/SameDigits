/*
 * Erik Neville
 */
package NumbersGame;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Erik Neville <erikeneville@gmail.com>
 */
public class NumbersGame {

    static boolean isRepeat(int n) {
        // ^(\d)\1*$
        String st = String.valueOf(n);

        for (int i = 0; i < st.length() - 1; i++) {
            char ch = st.charAt(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 100;
        int[] a = new int[n];
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;

            while (a[i] > 0) {
                stack.push(a[i] % 10);
                a[i] = a[i] / 10;
            }
            int[] b = new int[stack.size()];
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        }
    }
}

// String.valueOf(i).contains("7")

