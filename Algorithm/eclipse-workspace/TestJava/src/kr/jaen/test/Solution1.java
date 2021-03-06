package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("Solution1.txt"));
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int Answer;
		for(int t=1; t<=T; t++) {
			Answer=0;
			int row = s.nextInt();
			int col = s.nextInt();
			boolean locked = false;
			char[][] map = new char[row][col];
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					map[i][j] = s.next().charAt(0);
				}
			}
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					if(map[i][j]!='T')continue;
					else {
						locked = false;
						if(i>0) {
							for(int x=i-1; x>=0; x--) {
								if(map[x][j]=='W' || map[x][j]=='T')break;
								else if(map[x][j]=='0') continue;
								else {
									locked = true;
									break;
								}
							}
						}
						if(i<row-1 && !locked) {
							for(int x=i+1; x<row; x++) {
								if(map[x][j]=='W' || map[x][j]=='T')break;
								else if(map[x][j]=='0') continue;
								else {
									locked = true;
								}
							}
						}
						if(j>0 && !locked) {
							for(int y=j-1; y>=0; y--) {
								if(map[i][y]=='W' || map[i][y]=='T')break;
								else if(map[i][y]=='0') continue;
								else {
									locked = true;
								}
							}
						}
						if(j<col-1 && !locked) {
							for(int y=j+1; y<col; y++) {
								if(map[i][y]=='W' || map[i][y]=='T')break;
								else if(map[i][y]=='0') continue;
								else {
									locked = true;
								}
							}
						}
						if(locked) Answer++;
					}
				}
			}
			System.out.printf("#%d %d\n",t,Answer);
		}
	}

}
