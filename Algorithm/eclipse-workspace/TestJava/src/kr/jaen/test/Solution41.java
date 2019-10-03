package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution41 {
	static long Answer;
	static int N, S;
	public static void throwRock(int[] stone, int[][] lake) {
		/*
		 * X��� Y�� ���� �ּҰ�, �ִ밪�� ����Ͽ� �� ���� ���� ��� ���� �迭 ��Ҹ� ���������ش�. 
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
		int T=sc.nextInt();//�׽�Ʈ ���̽� ��  
		
		for(int test_case=1; test_case<=T; test_case++){
			N=sc.nextInt(); //�迭�� ũ�� N
			int[][] lake = new int[N+1][N+1];
			S=sc.nextInt();//���� ��
			int[][] stone=new int[S][3];
			for(int i=0; i<S; i++){
				stone[i][0]=sc.nextInt();//��
			}
			
			for(int i=0; i<S; i++){
				stone[i][1]=sc.nextInt();//����ġ
				stone[i][2]=sc.nextInt();//����ġ
			}
			//////////////////////////////
			//( �� �κп� �˰��� ������ �Ѵ�. )//
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
