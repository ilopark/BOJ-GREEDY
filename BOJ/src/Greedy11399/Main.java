package Greedy11399;

import java.util.ArrayList;
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
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int arr[]=new int[num];
		int min=0;
		int sum=0;
		for(int i=0; i<num; i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0; i<num; i++) {
			min+=arr[i];
			sum+=min;
		}
		System.out.println(sum);
	}
}
