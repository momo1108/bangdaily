package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution13 {
	static int T, N;
	static int Answer;
	public static void check(char[][] area, int a, int b) {
		int xMin, xMax, yMin, yMax;
		if(a-1 < 0) xMin = 0;
		else xMin = a-1;
		if(a+1 == area.length) xMax = a;
		else xMax = a+1;
		if(b-1 < 0) yMin = 0;
		else yMin = b-1;
		if(b+1 == area.length) yMax = b;
		else yMax = b+1;
		for(int i=xMin; i<=xMax; i++) {
			for(int j=yMin; j<=yMax; j++) {
				if(area[i][j] == 'G') {
					return;
				}
			}
		}
		int subAnswer = 0;
		for(char[] building : area) {
			if(building[b]=='B') {
				subAnswer++;
			}
		}
		for(char building : area[a]) {
			if(building=='B') {
				subAnswer++;
			}
		}
		subAnswer--;
		if(subAnswer>Answer) Answer = subAnswer;
		return;
	}
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("Solution13.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			Answer = 2;
			char[][] area=new char[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					area[i][j] = sc.next().charAt(0);
				}
			}
			//////////////////////////////
			//( 이 부분에 알고리즘 구현을 한다. )//
			//////////////////////////////
			for(int x=0; x<N; x++) {
				for(int y=0; y<N; y++) {
					if(area[x][y]=='B') {
						check(area, x, y);
					}
				}
			}
			
			
			System.out.println("#"+test_case+" "+Answer);
		}
	}
}