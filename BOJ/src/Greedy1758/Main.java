package Greedy1758;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static void swap(int[]a, int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	static void reverse(int[]a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int [n];
		for(int i=0; i<n; i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		reverse(arr);
		long c=0;
		for(int i=0; i<n; i++) {
			if(arr[i]<i) {
				break;
			}else{
				c+=arr[i]-i;
			}
		}
		System.out.println(c);
	}
}
