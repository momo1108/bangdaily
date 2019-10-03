package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution22 {
	static long Answer;
	static int N, S;
	public static void hop(int[] strider, int[][] lake) {
		/*
		 *  �ұ����̵��� �迭�� �޾ƿ´�.
		 *  �ұ������� ���� ��ġ�� lake �迭 ���ο� ���� �� 1�� ǥ���Ѵ�.
		 *  3���� ������ ������ 1�� �Ǿ��ִ� �迭���� üũ�ϰ� 1�� ��� return�Ѵ�.
		 *  lake �ٱ����� ������ return�Ѵ�.
		 *  ���⺰�� üũ�ؾ� �Ѵ�.
		 *  �������� 1�� ��� ������ �����.
		 */
		if(lake[strider[0]][strider[1]]==1) return;
		if(strider[2]==1) {
			if(strider[0]-3 < 0 || strider[0]-5 < 0 || strider[0]-6 < 0) return;
			else if(lake[strider[0]-3][strider[1]]==1 || lake[strider[0]-5][strider[1]]==1 || lake[strider[0]-6][strider[1]]==1) return;
			else {
				lake[strider[0]-6][strider[1]]=1;
			}
		} else if(strider[2]==2) {
			System.out.printf("���� ��ġ : x - %d, y - %d\n", strider[0], strider[1]);
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
		int T=sc.nextInt();//�׽�Ʈ ���̽� ��  
		
		for(int test_case=1; test_case<=T; test_case++){
			Answer=0;
			N=sc.nextInt(); //�迭�� ũ�� NxN
			int[][] lake=new int[N][N];
			
			S=sc.nextInt();//�ұ�����(Strider)��
			int[][] strider=new int[S][3];
			for(int k=0; k<S; k++){
				strider[k][0]=sc.nextInt();//����ġ
				strider[k][1]=sc.nextInt();//����ġ
				strider[k][2]=sc.nextInt();//����(1:��,2:��)
			}
			//////////////////////////////
			//( �� �κп� �˰����� ������ �Ѵ�. )//
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