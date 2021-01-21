package Greedy13413;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		String a="";
		String b="";
		
		
		for(int i=0; i<arr.length; i++) {
			int count=0;
			arr[i]=scan.nextInt();
			a=scan.next();
			b=scan.next();
			String []arr1=a.split("");
			String []arr2=b.split("");
			for(int j=0; j<a.length(); j++) {
				if(j<a.length()-1) {
					if(arr1[j].equals(arr2[j])) {
						continue;
					}else {
						if(arr1[j].equals(arr2[j+1])&&arr2[j].equals(arr1[j+1])) {
							count++;
							String c=arr1[j];
							arr1[j]=arr1[j+1];
							arr1[j+1]=c;
							c="";
							j++;
							continue;
						}else {
							count++;
							String c=arr2[j+1];
							arr1[j]=arr2[j];
							arr1[j+1]=arr2[j+1];
							if(j==a.length()-1)
								j++;
							continue;
						}
					}
				}else if(j==a.length()-1) {
					if(arr1[j].equals(arr2[j])) {
						System.out.println(count);
						continue;
					}else {
						count++;
						System.out.println(count);
						continue;
					}
				}
			}	
		}
	}
}

