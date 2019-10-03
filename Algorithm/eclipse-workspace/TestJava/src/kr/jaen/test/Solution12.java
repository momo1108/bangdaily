package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution12 {
	static int T, N;
	static int AnswerEven, AnswerOdd;
	public static void check(int[][] arr, int x, int y) {
		if(arr[x-1][y]/2*2==arr[x-1][y] && arr[x+1][y]/2*2==arr[x+1][y] && arr[x][y-1]/2*2==arr[x][y-1] && arr[x][y+1]/2*2==arr[x][y+1]) {
			AnswerEven++;
		} else if(arr[x-1][y]/2*2!=arr[x-1][y] && arr[x+1][y]/2*2!=arr[x+1][y] && arr[x][y-1]/2*2!=arr[x][y-1] && arr[x][y+1]/2*2!=arr[x][y+1]) {
			AnswerOdd++;
		} else return;
	}
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("Solution12.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			AnswerEven = 0;
			AnswerOdd = 0;
			int[][] arr=new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			for(int x=1; x<N-1; x++) {
				for(int y=1; y<N-1; y++) {
					check(arr, x, y);
				}
			}

			
			
			System.out.println("#"+test_case+" "+AnswerEven+" "+AnswerOdd);
		}
	}
}