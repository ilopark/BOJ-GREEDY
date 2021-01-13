package Greedy3120;
import java.util.*;

public class Main {		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start=scan.nextInt();
		int end=scan.nextInt();
		int count=0;
		int result=0;
		if(end>start) {
			result=end-start;
		}else if(end<start) {
			result=start-end;
		}
		int a=Math.abs(result);
		while(true) {
			if(a>=10) {
				a-=10;
				count++;
			}else if(a>7) {
				a-=10;
				count++;
			}
			else if(a>=5) {
				a-=5;
				count++;
			}else if(a>3) {
				a-=5;
				count++;
			}else if(a>=1) {
				a-=1;
				count++;
			}
			else if(a==0) {
				break;
			}else {
				a+=1;
				count++;
			}
		}
		System.out.println(count);
	}
}


