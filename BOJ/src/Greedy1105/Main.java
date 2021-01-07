package Greedy1105;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String L=scan.next();
		String R=scan.next();
		int count=0;
		if(L.length()!=R.length()) {
			System.out.println(0);
		}else {
			for(int i=0; i<R.length(); i++) {
				if(L.charAt(i)==R.charAt(i)) {
					count++;
				}else {
					break;
				}
			}
			System.out.println(count);
		}
		
	}
}
