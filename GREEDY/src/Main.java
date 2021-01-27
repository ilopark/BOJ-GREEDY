import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [][]start=new int [n][2];
		int max=0;
		for(int i=0; i<n; i++) {
			start[i][0]=scan.nextInt();
			start[i][1]=scan.nextInt();
			if(max<start[i][1]) {
				max=start[i][1];
			}
			
		}
		Arrays.sort(start, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int [] o2) {
				if(o2[1]==o1[1]) {//만약 2번째 배열의 크기가 같은게 있다면
					return o1[0]-o2[0];// 1번째 배열의 값이 작은 순서대로 => 오름차순
				}else {
					return o2[1]- o1[1]; //o2[1]-o[1] => 내림차순
				}
			}
		});
		max-=start[0][0];
		for(int i=1; i<n; i++) {
			if(max>start[i][1]) {
				max=start[i][1];
				max-=start[i][0];
			}else if(max==start[i][1]) {
				max-=start[i][0];
			}else if(max<start[i][1]) {
				
				max-=start[i][0];
			}
		}
		if(max>=0)
			System.out.println(max);
		else
			System.out.println(-1);
	}
}
