package Greedy2810번;
import java.util.ArrayList;
import java.util.List;
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
	public static void main(String[] args)	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		String s=scan.next();
		String s2=s;
		s2=s2.replaceAll("S", "*S*");
		s2=s2.replaceAll("LL", "*LL*");
		s2=s2.replaceAll("\\*\\*", "*");
		
		int count=0;
		for(int i=0; i<s2.length(); i++) {
			if(s2.charAt(i)=='*')
				count++;
		}
		System.out.println(s.length()<count ? s.length() : count ); //컵 홀더의 갯수를 구하는게 아니라 컵홀더를 사용 할 수 있는 사람의 명수를 구하는거
		
		
	}
}
