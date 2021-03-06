package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution31 {
	static int Answer;
	static int X, Y, N;
	public static void move(int[] player, int[][] room) {
		Answer -= 1000;
		int price;
		for(int i=0; i<player[2]; i++) {
			//System.out.printf("player : %d, %d\n",player[0],player[1]);
			int direction, move, j=1;
			direction = room[player[0]][player[1]]/10;
			move = room[player[0]][player[1]]%10;
			//System.out.printf("tile : %d, %d\n",direction,move);
			switch(direction) {
				case 1:
					for(; j<=move; j++) {
						if(player[0]-j<1) return;
					}
					j--;
					player[0] -= j;
					break;
				case 2:
					for(; j<=move; j++) {
						if(player[0]-j<1 || player[1]+j>Y) return;
					}
					j--;
					player[0] -= j;
					player[1] += j;
					break;
				case 3:
					for(; j<=move; j++) {
						if(player[1]+j>Y) return;
					}
					j--;
					player[1] += j;
					break;
				case 4:
					for(; j<=move; j++) {
						if(player[0]+j>X || player[1]+j>Y) return;
					}
					j--;
					player[0] += j;
					player[1] += j;
					break;
				case 5:
					for(; j<=move; j++) {
						if(player[0]+j>X) return;
					}
					j--;
					player[0] += j;
					break;
				case 6:
					for(; j<=move; j++) {
						if(player[0]+j>X || player[1]-j<1) return;
					}
					j--;
					player[0] += j;
					player[1] -= j;
					break;
				case 7:
					for(; j<=move; j++) {
						if(player[1]-j<1) return;
					}
					j--;
					player[1] -= j;
					break;
				case 8:
					for(; j<=move; j++) {
						if(player[0]-j<1 || player[1]-j<1) return;
					}
					j--;
					player[0] -= j;
					player[1] -= j;
					break;
			}
		}
		price = room[player[0]][player[1]]*100;
		Answer += price;
	}
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("Solution31.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // Test case

		// fill up the data
		for (int test_case = 1; test_case <= T; test_case++) {

			X = sc.nextInt(); // position row
			Y = sc.nextInt(); // position col
			N = sc.nextInt(); // number of player

			int[][] room = new int[X + 1][Y + 1];// because start from 1;
			// fill up table
			for (int i = 1; i <= X; i++) {
				for (int j = 1; j <= Y; j++) {
					room[i][j] = sc.nextInt();
				}
			}

			int[][] player = new int[N][3];
			for (int i = 0; i < N; i++) {
				player[i][0] = sc.nextInt(); // coord X
				player[i][1] = sc.nextInt(); // coord Y
				player[i][2] = sc.nextInt(); // steps
			}
			//////////////////////////////
			//( 이 부분에 알고리즘 구현을 한다. )//
			//////////////////////////////
			Answer = 0;
			for(int[] e : player) {
				move(e, room);
			}
			
			
			System.out.println("#" + test_case + " " + Answer);
		}

	}
}
