package Strings_practice;
import java.util.*;
public class Reverse {
	public static void main(String at[]) {
		System.out.print("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String s_original = new String(sc.nextLine());
		String arr[] = s_original.split(" ");
		StringBuffer temp = new StringBuffer(arr[arr.length/2]);
		arr[arr.length/2] = temp.reverse().toString();
		s_original = String.join(" ", arr);
		System.out.println(s_original);
	}
}
