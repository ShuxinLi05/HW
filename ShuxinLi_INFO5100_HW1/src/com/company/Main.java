package com.company;

import sun.lwawt.macosx.CSystemTray;

import java.util.Arrays;
import java.util.HashMap;

public class Main
{

    public static void main(String[] args)
    {

        // Question 1 tests:
        int arr1[] = {1,2,3,2};
        int arr2[] = {1,1,1,1,1};
        int arr3[] = {1,2,3,4,5};
        System.out.println("Question 1 test answers: " );
        sumOfUniqueNums(arr1);
        sumOfUniqueNums(arr2);
        sumOfUniqueNums(arr3);

        // Question 2 tests:

        int nums1[] = {-4,-1,0,3,10};
        int nums2[] = {-7,-3,2,3,11};
        System.out.println("Question 2 test answers: " );
        sortedSquare(nums1);
        sortedSquare(nums2);

        // Question 3 tests:
        int[] arr4 = {2,3,4,2,2,3,5,7};
        int[] arr5 = {4,6,2,4,3,8,6,2};
        System.out.println("Question 3 test answers: " );
        nonRepeatedInt(arr4);
        nonRepeatedInt(arr5);

        // Question 4 tests:
        String ransomNote1 = "a";
        String magazine1 = "b";
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println("Question 4 test answers: " );
        System.out.println(twoStringCons(ransomNote1,magazine1));
        System.out.println(twoStringCons(ransomNote2,magazine2));
        System.out.println(twoStringCons(ransomNote3,magazine3));

        // Question 5 tests:
        String letter1 = "1A3d4s5t ";
        String letter2 = "A2bb2d4";
        System.out.println("Question 5 test answers: " );
        letterFollDigit(letter1);
        letterFollDigit(letter2);


    } //close main function


    // Question 1 function
    private static int sumOfUniqueNums(int[] arr)
    {

        int[] feq = new int[20];
        int sum = 0;

        // count the frequency of the number in the list
        for (int i = 0; i < arr.length; i++)
        {
            feq[arr[i]]++;
        } //close for loop

        for (int i = 0; i < arr.length; i++)
        {
            if (feq[arr[i]] == 1)
            {
                sum += arr[i];
            } //close if statement

        } //close for loop

        System.out.println(sum);
        return sum;

    } // close sunOfUniqueNums function

    // Question 2 function

    private static int[] sortedSquare(int[] arr)
    {

        int[] output = new int[arr.length];
        int start = 0;
        int end = arr.length-1;
        int ind = arr.length-1;

        while (start <= end)
        {
            if(Math.abs(arr[start]) < Math.abs(arr[end]))
            {
                output[ind] = arr[end] * arr[end];
                end--;
            } else {
                output[ind] = arr[start] * arr[start];
                start ++;
            }
            ind--;
        }
        System.out.println(Arrays.toString(output));
        return output;

    }

    // Question 3 function
    private static int nonRepeatedInt (int[] arr)
    {

        int[] feq = new int[20];
        int result = 0;

        // count the frequency of the number in the list
        for (int i = 0; i < arr.length; i++)
        {
            feq[arr[i]]++;
        } //close for loop

        for (int i = 0; i < arr.length; i++)
        {
            if (feq[arr[i]] == 1)
            {
                result += arr[i];
                break;
            } //close if statement

        } //close for loop

        System.out.println(result);
        return result;

    }

    // Question 4 function
    private static boolean twoStringCons (String ransomNote, String magazine)
    {
        HashMap<Character, Integer> magMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++)
        {
            char ch = magazine.charAt(i);
            int count = magMap.getOrDefault(ch, 0) + 1;
            magMap.put(ch, count);
        }

        for(int i = 0; i < ransomNote.length(); i++)
        {
            char ch = ransomNote.charAt(i);
            if(!magMap.containsKey(ch) || magMap.get(ch) <=0)
            {
                return false;
            }
            int count = magMap.getOrDefault(ch, 0) - 1;
            magMap.put(ch, count);
        }
        return true;

    }

    // Question 5 function
    private static void letterFollDigit(String str)
    {
        char[] strLetter = str.toCharArray();
        for(int i = 0, j = 1; i< strLetter.length && j < strLetter.length; i++, j++)
        {
            if(Character.isLetter(strLetter[i]) != Character.isLetter(strLetter[j]))
            {
                if(j == strLetter.length-1)
                {
                    System.out.println("True");
                }
                continue;
            }else{
                System.out.println("False");
                break;
            }

        }

    }


} // close main class
