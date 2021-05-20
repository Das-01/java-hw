package com.globallogic.strings;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String myStr = "My best education project in GlobalLogic";

//     Find the index of first “a” substring of myStr value and print result to console
//        char[] mySrtToChar =  myStr.toCharArray();
//        for (int i = 0; i < mySrtToChar.length; i++ ) {
//            if (mySrtToChar[i] == 'a') {
//                System.out.println("The first 'a' substring has been found at index: " + i);
//                break;
//            }
//        }

        int indexOfFirstA = myStr.indexOf("a");
        System.out.println("The first 'a' substring has been found at index: " + indexOfFirstA);


//     Find the index of last “b” substring of myStr value and print result to console
//        for (int i = (mySrtToChar.length -1); i > 0; i-- ) {
//            if (mySrtToChar[i] == 'b') {
//                System.out.println("The last 'b' substring has been found at index: " + i);
//                break;
//            }
//        }

        int indexOfLastB = myStr.lastIndexOf("b");
        System.out.println("The last 'b' substring has been found at index: " + indexOfLastB);

//     Get substring of myStr from 3 to 6 char index and print result to console
        String newSubstring = myStr.substring(3,6);
        System.out.println("A new substring, generated using the indices from 3 to 6 is: " + newSubstring);

//     Create static method reverseString(String) which return String value as result with changed order of letters
//     (reverse it, for example “abcd” ->”dcba”).
        reverseString("abcdf");


//        Task2:
//        In method main() declare two local variables myStr1 and myStr2 of String type and assign a value “Cartoon”
//        for first string and ”Tomcat” for second. Write code to display all of the letters, which are present in the
//        first word, but absent in the second.
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        System.out.println(findLetters(myStr1,myStr2));


//        Task 3
//        Create static method:uniqueChars(String s), which must take a String as argument and return an array of
//        distinct (unique) chars (char[]) of the given string. Check via string: “Using methods of class String” as argument.

//        Print distinct chars (if char is repeated in inputString, print it only once)
        System.out.println(uniqueDistinctChar("Using methods of class String"));

//      Print unique chars only (if char is repeated in inputString, don't print it at all)
        System.out.println(uniqueCharsOnly("Using methods of class String"));
    }


    public static String reverseString(String input){
        char[] newTempArray = input.toCharArray();
        char[] finalArray = new char[newTempArray.length];
        for (int i = 0, j = (newTempArray.length-1); i < newTempArray.length; i++ , j--) {
            finalArray[i] = newTempArray[j];
        }
        String finalStr = new String(finalArray);
        System.out.println("Got as input: " + input + "; the reversed string is: " + finalStr);
        return finalStr;
    }


    public static char[] findLetters(String str1, String str2){
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        char[] result = new char[char1.length];

        for (int i = 0, j = 0; i < char1.length; i++) {
            if (!findCharInArray(char1[i], char2) && !findCharInArray(char1[i], result)) {
                result[j] = char1[i];
                j++;
            }
        }
        return result ;
    }

    public static boolean findCharInArray(char inputLetter, char[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == inputLetter) {
                return true;
            }
        }
        return false;
    }

    public static char[] uniqueDistinctChar(String inputString) {
        char[] inputStringChars = inputString.toCharArray();
        char[] distinctChars = new char[inputString.length()];

        for (int i = 0, j = 0; i < inputStringChars.length; i++) {
            if (!findCharInArray(inputStringChars[i],distinctChars) ) {
                distinctChars[j] = inputStringChars[i];
                j++;
            }
        }
        return distinctChars;
    }

    public static int uniqueCharNumber(char inputChar, String inputString) {
        int inputCharNumber = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputChar) {
                inputCharNumber++;
            }
        }
        return inputCharNumber;
    }

    public static char[] uniqueCharsOnly(String inputString) {
        char[] inputStringChars = inputString.toCharArray();
        char[] onlyUniqueChars = new char[inputString.length()];

        for (int i = 0, j = 0; i < inputStringChars.length; i++) {
            if (1 - uniqueCharNumber(inputStringChars[i], inputString) == 0 ) {
                onlyUniqueChars[j] = inputStringChars[i];
                j++;
            }
        }
        return onlyUniqueChars;
    }
}
