package kr.bang.algorithm;

import java.util.Scanner;

public class Subway {
	static int N; // 지하철 역의 수
	static int M; // 목적지 역
	static int[][] subway; // 노선도
	static int answer = 2147483647; // 최소값을 저장해줄 변수
	static int[] answerArr; // 최소경로를 저장해줄 변수
	static int sum = 0; // 현재까지 이동시간 저장해줄 변수
	static int[] stationlist; // 현재까지 경로를 저장해줄 변수
	static int stationNum; // 출력할 역의 개수 +1
	static boolean[] visited; // 이미 방문한 역인지 확인해줄 변수
	public static void travel(int station, int index) {
		// index : 방문한 순서대로 stationlist에 넣어주기 위한 index값
		if(station==M-1) {
			if(sum<answer) {
				System.out.println("answer found");
				answer = sum;
				stationNum = index;
				for(int i=0; i<stationNum; i++) {
					answerArr[i] = stationlist[i];
				}
			}
			return;
		}
		if(sum>=answer) return;
		for(int i=1; i<N; i++) {
			if(visited[i] || i==station) continue;
			visited[i] = true;
			stationlist[index] = i+1;
			sum += subway[station][i];
			travel(i, index+1);
			visited[i] = false;
			stationlist[index] = 0;
			sum -= subway[station][i];
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		M = s.nextInt();
		visited = new boolean[N];
		visited[0] = true;
		answerArr = new int[N];
		stationlist = new int[N];
		stationlist[0] = 1;
		subway = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				subway[i][j] = s.nextInt();
			}
		}
		System.out.println();
		// DFS를 사용한다. 재귀함수를 사용
		// i, j 배열에서 반복문을 사용해서 i=1부터 n-1까지 진행하는데 열의 번호를 행의 번호에 대입해서 다시 재귀함수를 부른다.
		// 진행 중에 최소값을 넘어버리면 return 한다.
		travel(0, 1);
		System.out.println(answer);
		for(int i=0; i<stationNum; i++) {
			System.out.print(answerArr[i]+" ");
		}
	}

}
