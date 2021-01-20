package Greedy11509;

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
		int n=scan.nextInt();
		int count=0;
		int h[][]=new int[n][2];
		for(int i=0; i<n; i++) {
			h[i][0]=scan.nextInt();
		}
		int a=h[0][0];
		for(int i=0; i<n; i++) {
			if(a==1) {
				count++;
				if(i+1<n) {
					a=h[i+1][0];
					h[i][1]=i;
				}
				continue;
			}
			if(h[i][1]==i&&i!=0) {
				continue;
			}else if(h[i][1]!=i) {
				for(int j=i; j<n; j++) {
					if(h[j][0]==a-1) {
						h[j][1]=j;
						a=h[j][0];
					}if(a==1) {
						count++;
						a=h[j+1][0];
						break;
					}
					if(j==n-1) {
						count++;
						if(i+1<n) {
							a=h[i+1][0];
							h[i][1]=i;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}

