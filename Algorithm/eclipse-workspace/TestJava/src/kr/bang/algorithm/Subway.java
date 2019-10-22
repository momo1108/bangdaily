package kr.bang.algorithm;

import java.util.Scanner;

public class Subway {
	static int N; // ����ö ���� ��
	static int M; // ������ ��
	static int[][] subway; // �뼱��
	static int answer = 2147483647; // �ּҰ��� �������� ����
	static int[] answerArr; // �ּҰ�θ� �������� ����
	static int sum = 0; // ������� �̵��ð� �������� ����
	static int[] stationlist; // ������� ��θ� �������� ����
	static int stationNum; // ����� ���� ���� +1
	static boolean[] visited; // �̹� �湮�� ������ Ȯ������ ����
	public static void travel(int station, int index) {
		// index : �湮�� ������� stationlist�� �־��ֱ� ���� index��
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
		// DFS�� ����Ѵ�. ����Լ��� ���
		// i, j �迭���� �ݺ����� ����ؼ� i=1���� n-1���� �����ϴµ� ���� ��ȣ�� ���� ��ȣ�� �����ؼ� �ٽ� ����Լ��� �θ���.
		// ���� �߿� �ּҰ��� �Ѿ������ return �Ѵ�.
		travel(0, 1);
		System.out.println(answer);
		for(int i=0; i<stationNum; i++) {
			System.out.print(answerArr[i]+" ");
		}
	}

}