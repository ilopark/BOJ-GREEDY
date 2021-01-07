package Greedy11501;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int max=0;
		int cnt=0;
		for(int i=0; i<n; i++) {
			int count=0;
			int m=scan.nextInt();
			int []arr=new int[m];
		
			for(int j=0; j<m; j++) {
				arr[j]=scan.nextInt();
			}
			max=arr[0];
			for(int j=1; j<arr.length; j++) {
				if(max<=arr[j]) {
					max=arr[j];
				}else if(max>arr[j]){
					if(max==arr[m-1]) {
						for(int k=0; k<j-1; k++) {
							count+=arr[j-1]-arr[k];
						}
						
					}else {
						if(max!=arr[0]) {
							for(int k=0; k<j-1; k++) {
								count+=arr[j-1]-arr[k];
							}
							max=arr[j];
							cnt=j;
						}
					}
				}
				if(j==arr.length-1&&max==arr[j]) {
					if(cnt==0) {
						for(int k=0; k<j; k++) {
							count+=arr[j]-arr[k];
						}	
					}else {
						for(int k=cnt; k<j; k++) {
							count+=arr[j]-arr[k];
						}
					}
				}
			}
			System.out.println();
			System.out.println(count);
			
		
		}
	}
}
