package binarySearch;
import java.util.Arrays;


public class Main {
	
	public static int findMax(int[] a)
	{
		int max = a[0];
		for (int i = 0; i < a.length; i++){
			if (a[i] > max)		max = a[i];
		}
		return max;
		}
	
	
	public static void main(String[] args) {
		int[] a= {10, 20, 25, 30, 40, 50, 60, 90};
		int R = findMax(a);
		System.out.println(R);
	}
}
