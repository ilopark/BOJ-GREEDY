package Greedy1343;

import java.util.Scanner;

public class Main {
	static String result="";	
	static void print(int size) {
		while(size>0) {
			if(size>=4) {
				result+="AAAA";
				size-=4;
			}else {
				result+="BB";
				size-=2;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String x=scan.next();
		char c;
		int count=0;
		if(x.equals('X')) {
			System.out.println(-1);
			return;
		}
		for(int i=0; i<x.length(); i++) {
			c=x.charAt(i);
			if(c=='X') {
				count++;
				if(i==x.length()-1) {
					if(count%2==1) {
						System.out.println(-1);
						return;
					}else {
						print(count);
					}
				}
			}else if(c=='.') {
				if(count%2==1) {
					System.out.println(-1);
					return;
				}else {
					print(count);
					result+=".";
					count=0;
				}
			}
		}
		System.out.println(result);
	}
}
