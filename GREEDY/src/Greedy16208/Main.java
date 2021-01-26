package Greedy16208;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static void swap(long []a, int idx1, int idx2) {
		long t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	static void reverse(long []a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length-1-i);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		long []a=new long[n];
		long max=0;
		long count=0;
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
			max+=a[i];
		}
		Arrays.sort(a);
		reverse(a);
		for(int i=0; i<n-1; i++) {
			max=max-a[i];
			count+=max*a[i];
		}
		System.out.println(count);
	}
}
