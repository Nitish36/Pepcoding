package strings;
/*
 * You are given a string. 
 * You have to print all palindromic substrings of the given string.
 * Input Format
 * A String
 * Output Format
 * All palindromic substrings(one in a line).
 * First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.
 */
//import java.io.*;
import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(String ss)
    {
        int i = 0;
        int j = ss.length()-1;
        while(i<=j)
        {
            char c1 = ss.charAt(i);
            char c2 = ss.charAt(j);
            
            if(c1!=c2)
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
	public static void solution(String str){
		//write your code here
		for(int i = 0;i<str.length();i++)
		{
		    for(int j = i+1;j<=str.length();j++)
		    {
		        String ss = str.substring(i,j);
		        if(isPalindrome(ss)==true)
		        {
		            System.out.println(ss);
		        }
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
		scn.close();
	}

}