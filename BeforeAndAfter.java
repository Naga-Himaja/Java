package Strings_practice;
import java.util.Scanner;
public class BeforeAndAfter {
	public static void main(String args[])
	{
		System.out.print("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String s1 = new String(sc.nextLine());
		System.out.print("Enter a sub string : ");
		String sub = new String(sc.nextLine());
		String res = "";
		int f = s1.indexOf(sub);
		int prev =f;
		int next = f+sub.length();
		if(f!=-1)
		{
			while(f!=-1)
			{
				if(f!=0)
				{
					if(prev!=f-sub.length())
						res = res + s1.charAt(f-1);
				}	
				if(f+sub.length()-1 < s1.length()-1)
				{	
					if(s1.indexOf(sub,next)!=next)
						res = res + s1.charAt(f+sub.length());
				}	
				prev = f;
				f = s1.indexOf(sub,next);
				next = 	f+ sub.length();
			}
			System.out.println(res);
		}
		else
			System.out.println("It is not a substring!");
	}
}
