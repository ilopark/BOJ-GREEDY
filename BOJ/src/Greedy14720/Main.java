package Greedy14720;

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
		int num=scan.nextInt();
		int[]milk= {0, 1, 2};
		int idx=0;
		int count=0;
		
		for(int i=0; i<num; i++) {
			if(scan.nextInt()==milk[idx%3]) {
				count++;
				idx++;
			}
		}
		System.out.println(count);
	}
}