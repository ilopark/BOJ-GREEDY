package Greedy11047;

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
		int num=scan.nextInt();
		int balance=scan.nextInt();
		int count=0;
		int coins[]=new int[num];
		for(int i=0; i<num; i++) {
			coins[i]=scan.nextInt();
		}
		reverse(coins);
		for(int i=0; i<num; i++) {
			if(balance>=coins[i]) {
				count+=balance/coins[i];
				balance=balance%coins[i];
			}
		}
		System.out.println(count);
	}
}