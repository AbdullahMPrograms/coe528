package coe528.lab2;

import java.util.Arrays;

/**
 *
 * @author AbdullahPC
 */
public class AnagramChecker {

    //Requires: Two strings 'str1' and 'str2'.
    //Modifies: Nothing.
    //Effects: Returns true if the strings 'str1' and 'str2' are anagrams of each other, and false otherwise.
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || "".equals(str1) || "".equals(str2)) {
            return false;
        }
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();
        char[] arrayS1 = s1.toCharArray();
        char[] arrayS2 = s2.toCharArray();
        Arrays.sort(arrayS1);
        Arrays.sort(arrayS2);
        return Arrays.equals(arrayS1, arrayS2);
    }

    public static void main(String[] args) {
        if (args.length == 2) {
            System.out.println("Argument 1: " + args[0]);
            System.out.println("Argument 2: " + args[1]);
            System.out.println(areAnagrams(args[0], args[1]));
        }
    }
}
