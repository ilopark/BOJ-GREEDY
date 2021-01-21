package Greedy16435;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int []arr=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<=k) {
				k++;
			}
		}
		System.out.println(k);
	}
}
