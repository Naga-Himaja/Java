package Strings_practice;
import java.util.*;

public class String_Rotate {
	public static void main(String a[])
	{
		System.out.print("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		StringBuffer s1 = new StringBuffer(sc.nextLine());
		String snew = s1.append(s1).toString();
		System.out.print("Enter another string : ");
		String s2 = new String(sc.nextLine());
		boolean b = snew.contains(s2);
		s1.setLength(s1.length()/2);
		if(b==true)
			System.out.println(s2+" is the rotated version of "+s1);
		else
			System.out.println(s2+" is not the rotated version of "+s1);
	}
}
