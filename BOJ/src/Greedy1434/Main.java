package Greedy1434;

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
		int box=scan.nextInt();
		int book=scan.nextInt();
		int[]arrbook=new int[book];
		int[]arrbox=new int[box];
		int sumbox=0;
		int sumbook=0;
		int result=0;
		for(int i=0; i<box; i++) {
			arrbox[i]=scan.nextInt();
		}
		for(int i=0; i<book; i++) {
			arrbook[i]=scan.nextInt();
		}
		for(int i=0; i<arrbook.length; i++) {
			
		}
		for(int i=0; i<arrbox.length; i++) {
			sumbox+=arrbox[i];
		}
		for(int i=0; i<arrbook.length; i++) {
			sumbook+=arrbook[i];
		}
		result=sumbox-sumbook;
		System.out.println(result);
	}
}
