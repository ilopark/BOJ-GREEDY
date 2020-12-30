package Greedy5585;

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
			swap(a, i, a.length-1-i);
		}
	}
	 public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 int balance=1000-scan.nextInt();
		 int count=0;
		 int coins[]= {500,100,50,10,5,1};
		 for(int i=0; i<coins.length; i++) {
			 if(balance>=coins[i]) {
				 count+=balance/coins[i];
				 balance=balance%coins[i];
			 }
		 }
		 System.out.println(count);
	 }
	    
	}
