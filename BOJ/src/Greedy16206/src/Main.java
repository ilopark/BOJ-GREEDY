import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int count=0;
		int sum=0;
		int []arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=scan.nextInt();			
		}
		for(int i=0; i<n; i++) {
			if(arr[i]==10) {
				sum++;
			}else if(arr[i]>10){
				while(arr[i]>10&&count<m) {
					arr[i]-=10;
					count++;
					sum++;
					if(arr[i]==10) {
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
		
	}
}
