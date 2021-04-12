package com.globallogic.conditionsloops;
import java.util.Arrays;

public class Task {

    /* https://www.e-olymp.com/en/problems/902
    Determine the level of educational achievements for the pupil (elementary, average, sufficient, high) according to the given grade (from 1 to 12).

    Input
        One number that is a grade for the pupil.

    Output
        Print Initial for elementary level (grade from 1 to 3), Average for average level (grade from 4 to 6), Sufficient for sufficient level (grade from 7 to 9) and High for high level (grade from 10 to 12).
    */
    public String levelEducationAchievements(int grade) {
        String result = "";
        if ( grade > 0 && grade < 4) {
            result = "Initial";
        } else if ( grade > 3 && grade < 7) {
            result = "Average";
        } else if ( grade > 6 && grade < 10) {
            result = "Sufficient";
        } else if ( grade > 9 && grade < 13) {
            result = "High";
        }
        return result;
    }

    /* https://www.e-olymp.com/en/problems/923
    Determine the season name by the month number using the compound conditions.

    Input
        The number of the month.

    Output
        For spring months print Spring, for summer - Summer, for autumn - Autumn and for winter - Winter.
     */
    public String season(int month) {
        String result = "";
        if ( month > 0 && month < 3 || month == 12) {
            result = "Winter";
        } else if ( month > 2 && month < 6) {
            result = "Spring";
        } else if ( month > 5 && month < 9) {
            result = "Summer";
        } else if ( month > 8 && month < 12) {
            result = "Autumn";
        }
        return result;
    }

    /* https://www.e-olymp.com/en/problems/107
    Blank compact discs are on sale in packages of three kinds. A package with 100 disсs costs 100 UAH, one with 20 discs costs 30 UAH, and one disс costs 2 UAH. What minimal sum of money should you pay to buy n such disсs?

    Input
        The natural number n (n ≤ 1000).

    Output
        Print the minimal sum to buy n disсs.
 */
    public int compactDiscs(int numberOfDiscs) {
        int result = 0;
        int multiHund = numberOfDiscs / 100;
        result = multiHund * 100;
        int multiTwenty = numberOfDiscs % 100 / 20;
        result += multiTwenty * 30;
        int multiSingle = numberOfDiscs % 20;
        result += multiSingle * 2;
        return result;
    }

    /* https://www.e-olymp.com/en/problems/918
    Which quarter?
        It set a point with co-ordinates х and y. Define, in what co-ordinate quarter it is located.

    Input
        In a unique line through a blank 2 material numbers - co-ordinates of a point are set, value of co-ordinates on the module do not exceed 100.

    Output
        The singular is the number of a corresponding quarter, or 0 if unequivocally define a quarter it is impossible.
     */
    public int whichQuarter(int x, int y) {
        int quarter = 0;
        if ( x > 0 && y > 0) {
            quarter = 1;
        } else if ( x < 0 && y > 0) {
            quarter = 2;
        } else if ( x < 0 && y < 0) {
            quarter = 3;
        } else if ( x > 0 && y < 0) {
            quarter = 4;
        }
        return quarter;
    }

    /*https://www.e-olymp.com/en/problems/903
    First or last?
        Three digit number is given. What digit is bigger: the first digit or the last digit?

    Input
        One three digit number.

    Output
        Print the bigger digit between first and last. In case of equality, print "=" (without quotes).
    */
    public String firstOrLast(int number) {
        String myStringNumber = String.valueOf(number);
        String result = "=";
        char firstNumber = myStringNumber.charAt(0);
        char lastNumber = myStringNumber.charAt(myStringNumber.length() - 1);

        if (firstNumber > lastNumber) {
            result = String.valueOf(firstNumber);
        } else if (firstNumber < lastNumber) {
            result = String.valueOf(lastNumber);
        }
        return result;
    }

    /*https://www.e-olymp.com/en/problems/108
    Median number
        Three different numbers a, b, c are given. Print the median number.

    Input
        Integers a, b, c that do not exceed 1000 by absolute value.

    Output
        Print the median among three numbers.
     */
    public int medianNumber(int a, int b, int c) {
        int allDigits[] = {a,b,c};
        Arrays.sort(allDigits);

        return allDigits[1];
    }

    /*https://www.e-olymp.com/en/problems/906
    Product of digits
        Three digital number is given. Find the product of its digits.

    Input
        One three digital positive integer n.

    Output
        Print the product of digits in n.
     */
    public int productOfDigits2(int digit) {
        String myDigitString = String.valueOf(digit);
        String[] strArray = new String[myDigitString.length()];
        int result = 1;
        for (int i = 0; i < strArray.length ; i++) {
            strArray[i] = String.valueOf(myDigitString.charAt(i));
            result *= Integer.parseInt(strArray[i]);
        }
        return result;
    }
    public int productOfDigits(int digit) {
        int result = 1;
        while (digit > 1) {
            result *= digit % 10;
            digit /= 10;
        }
        return result;
    }

    /*https://www.e-olymp.com/en/problems/2
    Digits
        Find the number of digits in a nonnegative integer n.

    Input
        One nonnegative integer n (0 ≤ n ≤ 2 *109).

    Output
        Print the number of digits in number n.
     */
    public int numberOfDigits(int digit) {
        String myDigitString = String.valueOf(digit);
        return myDigitString.length();
    }
}
