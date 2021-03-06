package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution22 {
	static long Answer;
	static int N, S;
	public static void hop(int[] strider, int[][] lake) {
		/*
		 *  소금쟁이들의 배열을 받아온다.
		 *  소금쟁이의 최종 위치가 lake 배열 내부에 있을 때 1로 표시한다.
		 *  3번의 움직임 각각에 1이 되어있는 배열인지 체크하고 1인 경우 return한다.
		 *  lake 바깥으로 나가도 return한다.
		 *  방향별로 체크해야 한다.
		 *  본문에서 1인 요소 개수를 세어본다.
		 */
		if(lake[strider[0]][strider[1]]==1) return;
		if(strider[2]==1) {
			if(strider[0]-3 < 0 || strider[0]-5 < 0 || strider[0]-6 < 0) return;
			else if(lake[strider[0]-3][strider[1]]==1 || lake[strider[0]-5][strider[1]]==1 || lake[strider[0]-6][strider[1]]==1) return;
			else {
				lake[strider[0]-6][strider[1]]=1;
			}
		} else if(strider[2]==2) {
			System.out.printf("시작 위치 : x - %d, y - %d\n", strider[0], strider[1]);
			if(strider[0]+3 >= N || strider[0]+5 >= N || strider[0]+6 >= N) return;
			else if(lake[strider[0]+3][strider[1]]==1 || lake[strider[0]+5][strider[1]]==1 || lake[strider[0]+6][strider[1]]==1) return;
			else {
				lake[strider[0]+6][strider[1]]=1;
			}
		} else if(strider[2]==3) {
			if(strider[1]-3 < 0 || strider[1]-5 < 0 || strider[1]-6 < 0) return;
			else if(lake[strider[0]][strider[1]-3]==1 || lake[strider[0]][strider[1]-5]==1 || lake[strider[0]][strider[1]-6]==1) return;
			else {
				lake[strider[0]][strider[1]-6]=1;
			}
		} else {
			if(strider[1]+3 >= N || strider[1]+5 >= N || strider[1]+6 >= N) return;
			else if(lake[strider[0]][strider[1]+3]==1 || lake[strider[0]][strider[1]+5]==1 || lake[strider[0]][strider[1]+6]==1) return;
			else {
				lake[strider[0]][strider[1]+6]=1;
			}
		}
		
	}
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("Solution22.txt"));
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();//테스트 케이스 수  
		
		for(int test_case=1; test_case<=T; test_case++){
			Answer=0;
			N=sc.nextInt(); //배열의 크기 NxN
			int[][] lake=new int[N][N];
			
			S=sc.nextInt();//소금쟁이(Strider)수
			int[][] strider=new int[S][3];
			for(int k=0; k<S; k++){
				strider[k][0]=sc.nextInt();//행위치
				strider[k][1]=sc.nextInt();//열위치
				strider[k][2]=sc.nextInt();//방향(1:하,2:우)
			}
			//////////////////////////////
			//( 이 부분에 알고리즘 구현을 한다. )//
			//////////////////////////////
			for(int[] e : strider) {
				hop(e, lake);
			}
			for(int[] x : lake) {
				for(int y : x) {
					if(y==1) Answer++;
				}
			}
			
			
			System.out.println("#"+test_case+" "+Answer);
		}
	}
}
