package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
		
public class Main {
	static void swap(int[]a, int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	static void reverse(int[]a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length-1-i);
		}
	}
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String input =sc.nextLine();
	        String [] arr = input.split("\\-");
	        
	        int result=add(arr[0]);
	        for(int i=1;i<arr.length;i++) {
	            result-=add(arr[i]);
	        }
	        System.out.println(result);
	        
	    }
	    
	    public static int add(String i) {
	        String []arr = i.split("\\+");
	        int result=0;
	        for(String k : arr) {
	            result+=Integer.parseInt(k);
	        }	        
	        return result;
	    }
	    
	}
