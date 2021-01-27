package Greedy4055;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int count;
		float time;
		int endtime;
		int a=1;
		while(true){
			count=0;
			int n=scan.nextInt();
			if(n==0)
				break;
			int [][]party=new int [n][2];
			
			
			for(int i=0; i<n; i++) {
				party[i][0]=scan.nextInt();//시작시간
				party[i][1]=scan.nextInt();//끝나는시간
				}
			
			Arrays.sort(party, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[0]==o2[0]) {
						return o1[1]-o2[1];
					}else {
						return o1[0]-o2[0];
					}
				}});
			time=party[0][0];
			endtime=party[0][1];
			for(int i=0; i<n; i++) {
				if(time>=24) {
					System.out.println(count);
					break;
				}
				if(endtime<=party[i][1]&& party[i][1]<=24 && party[i][0]>=8) {
					endtime=party[i][1];
					if(endtime<=party[i][1]&& time<party[i][1]) {
						count++;
						time+=0.5;
						if(time<party[i][0]) {
							time=party[i][0];
							time+=0.5;
						}
					}
				}else {
					continue;
				
				}
			}
			if(time<=24) {
				System.out.println("On day "+a+" Emma can attend as many as "+count+" parties.");
				a++;
			}
		}
	}
}
