package coe528.lab2;

/**
 *
 * @author AbdullahPC
 */
public class Palindrome {

    //Requires: String a
    //Modifies: nothing return is a boolean variable
    //Effects: returns true if string a is a palindrome, false otherwise
    public static boolean isPalindrome(String a) {
        if (a == null || a.length() == 0) {
            return false;
        }
        a = a.toLowerCase();
        int i = 0, j = a.length() - 1;
        while (i < j) {
            if (a.charAt(i) != a.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            if (args[0].equals("1")) {
                System.out.println(isPalindrome(null));
            } else if (args[0].equals("2")) {
                System.out.println(isPalindrome(""));
            } else if (args[0].equals("3")) {
                System.out.println(isPalindrome("deed"));
            } else if (args[0].equals("4")) {
                System.out.println(isPalindrome(".Radar."));
            }
        }
    }
}
