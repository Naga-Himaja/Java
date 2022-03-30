import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" elements : ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		long start = System.nanoTime();
		MergeSort.splitAndMerge(arr,n,0,n-1);
		long end = System.nanoTime();
		System.out.println("Sorted Array is : ");
		MergeSort.display(arr,n);
		System.out.print("Time taken for execution in Nano seconds : ");
		System.out.println(end-start);
		sc.close();
	}
}
