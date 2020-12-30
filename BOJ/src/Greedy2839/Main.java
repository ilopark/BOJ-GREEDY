package Greedy2839;

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
		int weight=scan.nextInt();
		int count=0;
		
		while(true) {
			if(weight%5==0) {
				count+=weight/5;
				weight=weight%5;
				break;
			}else if(weight<=0) {
				count=-1;
			}
			weight=weight-3;
			count++;
		}
		System.out.println(count);
	}
}
