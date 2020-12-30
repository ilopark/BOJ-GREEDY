package Greedy2217번;

import java.util.Arrays;
import java.util.Collections;
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
		int w=0;
		int []weight=new int[num];
		
		for(int i=0; i<num; i++) {
			weight[i]=scan.nextInt();
		}
		Arrays.sort(weight);
		reverse(weight);
		for(int i=1; i<=num; i++) {
			w=Math.max(w, weight[i-1]*i);
		}
		
		System.out.println(w);
	}
}
