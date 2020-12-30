package Greedy17224;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
		
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int l=scan.nextInt();
		int k=scan.nextInt();
		int count=0;
		int sum=0;
		List<Integer>list=new ArrayList<Integer>();
		for(int i=0; i<num*2; i++) 
			list.add(scan.nextInt());
		
		int result=0;
		
		for(int i=1; i<list.size(); i+=2) {
			result=i%2;
			if(result==1 && count<k) {
				if(list.get(i)<=l) {
					sum+=140;
					count++;
				}
			}
			if(count>=k) 
				break;
		}
		for(int j=count*2; j<list.size(); j+=2) {
			result=j%2;
			if(result==0 && count<k) {
				if(list.get(j)<=l) {
					count++;
					sum+=100;
				}
			}
			if(count>=k) 
				break;
		}
		System.out.println(sum);
	}
}