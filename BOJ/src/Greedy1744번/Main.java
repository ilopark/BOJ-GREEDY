package Greedy1744번;

import java.util.Arrays;
import java.util.Scanner;
		
public class Main {
	 public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 int num=scan.nextInt();
		 int[]arr=new int[num];
		 int minuscut=0;
		 for(int i=0; i<num; i++) {
			 arr[i]=scan.nextInt();
			 if(arr[i]<=0){
				 minuscut++;
			 }
		 }
		 Arrays.sort(arr);
		 
		 int i=-1;
		 int answer=0;
		 while(++i<minuscut) {
			 if(i+1<minuscut) {
				 answer+=arr[i]*arr[++i];
			 }else {
				 answer+=arr[i];
			 }
		 }
		 i=num;
		 while(--i>=minuscut) {
			 if(i-1>=minuscut&&arr[i-1]>1) {
				 answer+=arr[i]*arr[--i];
			 }else {
				 answer+=arr[i];
			 }
		 }
		 System.out.println(answer);
	 }
	    
}