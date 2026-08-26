import java.util.*;

class Solution {

    public String value(int arr[]) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]);
        }

        // Add 1 to the number represented by String
        int carry = 1;

        for (int i = str.length() - 1; i >= 0 && carry == 1; i--) {

            int digit = str.charAt(i) - '0';

            if (digit < 9) {
                str.setCharAt(i, (char)(digit + 1 + '0'));
                carry = 0;
            } else {
                str.setCharAt(i, '0');
            }
        }

        if (carry == 1) {
            str.insert(0, '1');
        }

        return str.toString();
    }

    public int[] plusOne(int[] digits) {

        String str = value(digits);

        int[] result = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i) - '0';
        }

        return result;
    }
}