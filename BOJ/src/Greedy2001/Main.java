package Greedy2001;

import java.util.*;

public class Main {		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]pasta=new int[3];
		int[]juice=new int[2];
		
		for(int i=0; i<3; i++) {
			pasta[i]=scan.nextInt();
		}
		int minpasta=pasta[0];
		for(int i=0; i<3; i++) {
			if(minpasta>pasta[i]) {
				minpasta=pasta[i];
			}
		}
		for(int i=0; i<2; i++) {
			juice[i]=scan.nextInt();
		}
		int minjuice=juice[0];
		for(int i=0; i<2; i++) {
			if(minjuice>juice[i]) {
				minjuice=juice[i];
			}
		}
		double result=(minpasta+minjuice)*1.1;
		System.out.printf("%.1f", result);
	}
}


