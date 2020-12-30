package Greedy14659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	public static void main(String[] args) throws IOException{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[]num=new int[n];
		int[]count=new int[n];
		for(int i=0; i<n; i++) {
			num[i]=scan.nextInt();
		}
		int max=count[0];
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(num[i]>num[j]) {
					count[i]++;
				}else {
					break;
				}
			}
			if(max<count[i]) {
				max=count[i];
			}
		}
		System.out.println(max);
	 }
}