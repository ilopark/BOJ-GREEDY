package Greedy17392;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int []a=new int[n];
		long sum=0;
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
			sum+=a[i]+1;
		}
		sum-=m;
		if(sum<0)
			System.out.printf("%d",sum*-1);
		else {
			System.out.println(0);
		}
	}
}

