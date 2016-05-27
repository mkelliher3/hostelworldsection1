package com.hostelworld.section1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by M on 21/05/2016.
 */
public class AnagramsTest {

    static void isAnagram(String s1, String s2) {
        // clean up the input strings
        String cleanS1 = cleanUpInput(s1);
        String cleanS2 = cleanUpInput(s2);

        // check if the length of both strings are same
        boolean result;
        if (cleanS1.length() != cleanS2.length())
            result = false;
        else {
//            convert to arrays of characters
            char[] s1Array = cleanS1.toCharArray();
            char[] s2Array = cleanS2.toCharArray();

//            sort characters in alphabetical order
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            result = Arrays.equals(s1Array, s2Array);
        }

//        print out the results of anagrams, highlighting them green if matched, otherwise red if not matched
        if (result)
            System.out.println((char) 27 + "[32m\"" + s2 + "\" is an anagram of \"" + s1 + "\"" + (char) 27 + "[0m]");
        else
            System.out.println((char) 27 + "[31m\"" + s2 + "\" is NOT an anagram of \"" + s1 + "\"" + (char) 27 + "[0m]");
    }

//    removing whitespaces, special symbols (! ? , ' etc.) and convert strings to lower case
    public static String cleanUpInput(String s) {
        Pattern pattern = Pattern.compile("[^a-zA-Z]");
        Matcher matcher = pattern.matcher(s);
        String cleanString = matcher.replaceAll("").toLowerCase();
        return cleanString;
    }

    public static void main(String[] args) {
        isAnagram("Punishment", "Nine Thumps");
        isAnagram("The Morse code", "Here come dots");
        isAnagram("Snooze alarms", "Alas! No more Zs");
        isAnagram("Halley's Comet", "Shall yet come");
        isAnagram("HostelWorld's Comet", "Shall yet come");
        isAnagram("One good turn deserves another", "Do rogues endorse that? No, never!");
        isAnagram("One good deed deserves another", "Do rogues endorse that? No, never!");
    }
}
