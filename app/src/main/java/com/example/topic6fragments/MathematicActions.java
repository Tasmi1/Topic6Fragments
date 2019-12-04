package com.example.topic6fragments;

public class MathematicActions {

    // for sum calculations
    private int firstnum, secondnum;

    // generating constructor

    public MathematicActions(int firstnum, int secondnum)
    {
        this.firstnum = firstnum;
        this.secondnum = secondnum;
    }

    public int sumnumbers()
    {
        return (int) (firstnum+secondnum);
    }

    public static float areaofcircle (float radius)
    {
        return (float) (Math.PI*radius*radius);
    }

    public static int reversenumber(int number)
    {
        int reverse = 0;
        while (number!=0)
        {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;

    }

    // check if number is palindrome or not

    public static boolean isPalindrome(int integer)
    {
        int palindrome = integer;
        int reverse = 0;
        while (palindrome != 0 )
        {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (integer == reverse)
            return true;
        else return false;
    }

    // check if number is Automorphic or not
    public static boolean isAutomorphic(int integer)
    {
        int automorphic = integer;
        int  square = automorphic * automorphic;

        String inputAutomorphic = automorphic + "";
        String squareAutomorphic = square + "";

        if (squareAutomorphic.endsWith(inputAutomorphic))
            return true;
        else
            return false;
    }

    public static String reverseString(String value)
    {
        StringBuilder sb = new StringBuilder(value);
        String result = sb.reverse().toString();
        return result;

    }



}
