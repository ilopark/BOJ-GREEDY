package Greedy3301;
import java.util.*;

public class Main {		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		int []change= {50000,10000,5000,1000,500,100,50,10};
		int n=scan.nextInt();
		
		for(int i=0; i<change.length; i++) {
			if(n>=change[i]) {
				count+=n/change[i];
				n=n%change[i];
			}
		}
		
		System.out.println(count);
	}
}

