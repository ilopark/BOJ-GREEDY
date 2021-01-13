package Greedy3321;
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
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int[]cal=new int[n];
		for(int i=0; i<cal.length; i++) {
			cal[i]=scan.nextInt();
		}
		Arrays.sort(cal);
		reverse(cal);
		double cash=a;
		int sum=c;
		double result=sum/cash;
		
		for(int i=0; i<n; i++) {
			if(result>(sum+cal[i])/(cash+b)) {
				int p=(int)Math.floor(result);
				System.out.println(p);
				break;
			}else {
				sum+=cal[i];
				cash+=b;
				result=sum/cash;
			}
			
		}
		
	}
}
