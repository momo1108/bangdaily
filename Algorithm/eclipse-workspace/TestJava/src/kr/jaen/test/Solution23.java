package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution23 {
	static long Answer;
	static int N, S;
	public static void hop(int[] p, int[][] lake, long index) {
		// System.out.println(index);
		// System.out.printf("%d %d %d\n",p[0],p[1],p[2]);
		if(p[0]==1) {
			for(int i=1; i<4; i++) {
				if(i*p[2]-1>=N) return;
				else {
					if(lake[i*p[2]-1][p[1]]==1) {
						Answer=index;
						return;
					} else {
						lake[i*p[2]-1][p[1]]++;
					}
				}
			}
		} else {
			for(int i=1; i<4; i++) {
				if(i*p[2]-1>=N) return;
				else {
					if(lake[p[1]][i*p[2]-1]==1) {
						Answer=index;
						return;
					} else {
						lake[p[1]][i*p[2]-1]++;
					}
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("Solution23.txt"));
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();//�׽�Ʈ ���̽� ��  
		
		for(int test_case=1; test_case<=T; test_case++){
			N=sc.nextInt(); //�迭�� ũ�� NxN
			int[][] lake=new int[N][N];
			
			S=sc.nextInt();//������ ��
			int[][] P=new int[S][3];
			for(int i=0; i<S; i++){
				P[i][0]=sc.nextInt();//����(1:��(��)->��(��),2:��(��)->��(��))
				P[i][1]=sc.nextInt();//��ġ(0~N-1, ����1=��(j)��ȣ,����2=��(i)��ȣ
				P[i][2]=sc.nextInt();//��ũ��(0~N-1)
			}
			//////////////////////////////
			//( �� �κп� �˰��� ������ �Ѵ�. )//
			//////////////////////////////
			Answer = 0;
			long index = 1;
			for(int[] e : P) {
				hop(e, lake, index);
				if(Answer!=0) break;
				index++;
			}
			
			
			System.out.println("#"+test_case+" "+Answer);
		}
	}

}
