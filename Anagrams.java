package Strings_practice;
import java.util.*;
public class Anagrams {
	public static void main (String a[])
	{
		System.out.print("Enter the first word : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.print("Enter the second word : ");
		String s2 = sc.nextLine();
		char c1[] = s1.toLowerCase().toCharArray();
		char c2[] = s2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		String sn1 = new String(c1);
		String sn2 = new String(c2);
		if(sn1.equals(sn2))
				System.out.println(s1+" and "+s2+" are anagrams");
		else
				System.out.println(s1+" and "+s2+ " are not anagrams");
	}
}
