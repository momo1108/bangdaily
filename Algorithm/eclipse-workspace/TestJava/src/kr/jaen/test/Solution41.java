package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution41 {
	static long Answer;
	static int N, S;
	public static void throwRock(int[] stone, int[][] lake) {
		/*
		 * X축과 Y축 값의 최소값, 최대값을 계산하에 그 범위 안의 모든 연못 배열 요소를 증가시켜준다. 
		 */
		int xMin, xMax, yMin, yMax;
		
		if(stone[1]-stone[0]<1) xMin = 1;
		else xMin = stone[1]-stone[0];
		
		if(stone[1]+stone[0]>N) xMax = N;
		else xMax = stone[1]+stone[0];
		
		if(stone[2]-stone[0]<1) yMin = 1;
		else yMin = stone[2]-stone[0];
		
		if(stone[2]+stone[0]>N) yMax = N;
		else yMax = stone[2]+stone[0];
		
		//System.out.printf("x : %d ~ %d, y : %d ~ %d\n",xMin,xMax,yMin,yMax);
		for(int i=xMin; i<=xMax; i++) {
			for(int j=yMin; j<=yMax; j++) {
				lake[i][j]++;
			}
		}
		
		return;
	}
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("Solution41.txt"));
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();//테스트 케이스 수  
		
		for(int test_case=1; test_case<=T; test_case++){
			N=sc.nextInt(); //배열의 크기 N
			int[][] lake = new int[N+1][N+1];
			S=sc.nextInt();//돌의 수
			int[][] stone=new int[S][3];
			for(int i=0; i<S; i++){
				stone[i][0]=sc.nextInt();//힘
			}
			
			for(int i=0; i<S; i++){
				stone[i][1]=sc.nextInt();//행위치
				stone[i][2]=sc.nextInt();//열위치
			}
			//////////////////////////////
			//( 이 부분에 알고리즘 구현을 한다. )//
			//////////////////////////////
			for(int[] e : stone) {
				throwRock(e, lake);				
			}

			int waveLength = 0;
			for(int[] e : lake) {
				for(int v : e) {
					if(v>waveLength) waveLength = v;
				}
			}
			Answer = waveLength;
			System.out.println("#"+test_case+" "+Answer);
		}
	}
}
