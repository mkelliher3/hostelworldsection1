package com.hostelworld.section1;

/**
 * Created by M on 21/05/2016.
 */
public class SpellingTest {

    public static void main(String[] args) {
        System.out.println(fixSpelling("hostleworld"));
    }

    // changed public to private because the function can be accessed from main
    // and that no methods outside of this class can access it.
    private static String fixSpelling(String name) {
        String wordToCheck = name; // I removed the new String() because it's redundant.

        if (wordToCheck.equalsIgnoreCase("hostleworld")) // I changed from == to .equalsIgnoreCase()
            name = "hostelworld";
//        I removed the else loop because it will be stuck in loop forever.
        return name;
    }
}
