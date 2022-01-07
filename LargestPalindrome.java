package Strings_practice;
import java.util.*;

public class LargestPalindrome {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a series of strings : ");
		String s = new String(sc.nextLine());
		String s1[] = s.split (" ");
		String palindrome= "";
		int count = 0;
		for(int i=0;i<s1.length; i++)
		{
			StringBuffer sb = new StringBuffer(s1[i]);
			if(s1[i].equalsIgnoreCase(sb.reverse().toString())==true)
			{
				if(s1[i].length()>count)
				{
					palindrome = s1[i];
					count = s1[i].length();
				}
				else if(s1[i].length()==count)
				{
					if(s1[i].compareToIgnoreCase(palindrome)>=0)
						palindrome = s1[i];
				}
			}
		}
		System.out.println("Largest Palindrome is : "+palindrome);
	}	
}
