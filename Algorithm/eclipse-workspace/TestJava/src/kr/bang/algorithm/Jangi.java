package kr.bang.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Jangi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();//ť ����
		int N, M;
		N = s.nextInt();
		M = s.nextInt();
		boolean[][] check = new boolean[N+1][M+1];
		int current_x = s.nextInt();
		int current_y = s.nextInt();
		int current_count = 0;		
		int destination_x = s.nextInt();
		int destination_y = s.nextInt();
		queue.offer(current_x);
		queue.offer(current_y);
		queue.offer(current_count);
		int x, y, count;
		// �Լ��� �Ȱ��� �����ϵ��� �������� ��ġ�� ���� Ƚ���� ���� �����ϴ� ť�� ������.
		while(true) {
			x = queue.poll();
			y = queue.poll();
			count = queue.poll();
			//System.out.printf("[%d, %d, %d]\n",x,y,count);
			if(check[x][y]) continue;
			if(x==destination_x && y==destination_y) {
				System.out.println(count);
				break;
			}
			int[] copy = new int[3];
			if(x-1>0 && y-2>0) {
				queue.offer(x-1);
				queue.offer(y-2);
				queue.offer(count+1);
				System.out.println("["+x+","+y+"] to ["+(x-1)+","+(y-2)+"]");
			}
			if(x-2>0 && y-1>0) {
				queue.offer(x-2);
				queue.offer(y-1);
				queue.offer(count+1);
				System.out.println("["+x+","+y+"] to ["+(x-2)+","+(y-1)+"]");
			}
			if(x-2>0 && y+1<M+1) {
				queue.offer(x-2);
				queue.offer(y+1);
				queue.offer(count+1);
				System.out.println("["+x+","+y+"] to ["+(x-2)+","+(y+1)+"]");
			}
			if(x-1>0 && y+2<M+1) {
				queue.offer(x-1);
				queue.offer(y+2);
				queue.offer(count+1);
				System.out.println("["+x+","+y+"] to ["+(x-1)+","+(y+2)+"]");
			}
			if(x+1<N+1 && y+2<M+1) {
				queue.offer(x+1);
				queue.offer(y+2);
				queue.offer(count+1);
				System.out.println("["+x+","+y+"] to ["+(x+1)+","+(y+2)+"]");
			}
			if(x+2<N+1 && y+1<M+1) {
				queue.offer(x+2);
				queue.offer(y+1);
				queue.offer(count+1);
				System.out.println("["+x+","+y+"] to ["+(x+2)+","+(y+1)+"]");
			}
			if(x+2<N+1 && y-1>0) {
				queue.offer(x+2);
				queue.offer(y-1);
				queue.offer(count+1);
				System.out.println("["+x+","+y+"] to ["+(x+2)+","+(y-1)+"]");
			}
			if(x+1<N+1 && y-2>0) {
				queue.offer(x+1);
				queue.offer(y-2);
				queue.offer(count+1);
				System.out.println("["+x+","+y+"] to ["+(x+1)+","+(y-2)+"]");
			}
			check[x][y] = true;
		}
		
	}
	
}
