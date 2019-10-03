package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution21 {
	static long Answer;
	static int N, S;
	public static void hop(int[] arr, int[][] lake, int index) {
		// [x][y] 위치에 count + 해준다.
		// [x][y] 위치 count가 2인지 확인 - 2인 경우 출력 후 진행, 아닌 경우 진행
		// 진행 방향에 따라 x + 3, x + 5, x + 6, y + 3, y + 5, y + 6 까지 진행 후 return;
		// 위치가 N보다 크거나 같은 경우 return;
		lake[arr[0]][arr[1]]++;
		// System.out.printf("x : %d, y : %d, lake : %d\n",arr[0],arr[1],lake[arr[0]][arr[1]]);
		if(lake[arr[0]][arr[1]]==2) {
			Answer = index+1;
			return;
		}
		if(arr[2]==1) {
			if(arr[0]+3<N) {
				lake[arr[0]+3][arr[1]]++;
				if(lake[arr[0]+3][arr[1]]==2) {
					Answer = index+1;
					return;
				} 
			}
			if(arr[0]+5<N) {
				lake[arr[0]+5][arr[1]]++;
				if(lake[arr[0]+5][arr[1]]==2) {
					Answer = index+1;
					return;
				}
			}
			if(arr[0]+6<N) {
				lake[arr[0]+6][arr[1]]++;
				if(lake[arr[0]+6][arr[1]]==2) {
					Answer = index+1;
					return;
				}
			}
		} else {
			if(arr[1]+3<N) {
				lake[arr[0]][arr[1]+3]++;
				if(lake[arr[0]][arr[1]+3]==2) {
					Answer = index+1;
					return;
				} 
			}
			if(arr[1]+5<N) {
				lake[arr[0]][arr[1]+5]++;
				if(lake[arr[0]][arr[1]+5]==2) {
					Answer = index+1;
					return;
				} 
			}
			if(arr[1]+6<N) {
				lake[arr[0]][arr[1]+6]++;
				if(lake[arr[0]][arr[1]+6]==2) {
					Answer = index+1;
					return;
				}
			}
		}
		return;
	}
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("Solution21.txt"));
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();//테스트 케이스 수  
		for(int test_case=1; test_case<=T; test_case++){
			Answer=-1;
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
			int index = 0;
			for(int[] arr : strider) {
				hop(arr, lake, index);
				if(Answer!=-1) break;
				index++;
			}
			if(Answer==-1) Answer=0;
			
			System.out.println("#"+test_case+" "+Answer);
		}
	}
}
