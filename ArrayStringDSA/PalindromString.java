import java.util.*;

public class PalindromString {

    public static boolean isPalindrom(String str) {

        // Initializing an empty string to store the reverse of original string.
        String revString = " ";

        // Initializing a new boolean variable for the answer.
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            revString += str.charAt(i);
        }

        // Checking if both the string are equal.
        if (str.equals(revString))
            ans = true;

        return ans;

    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        str = str.toLowerCase();
        boolean a = isPalindrom(str);
        System.out.println(a);

    }
}
